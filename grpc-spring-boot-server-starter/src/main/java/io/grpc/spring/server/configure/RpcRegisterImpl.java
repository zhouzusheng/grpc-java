package io.grpc.spring.server.configure;

import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.Response;
import com.ecwid.consul.v1.agent.model.NewService;
import com.ecwid.consul.v1.agent.model.Service;
import io.grpc.spring.server.service.RpcRegister;
import io.grpc.spring.server.service.ServiceInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.*;

public class RpcRegisterImpl implements RpcRegister {

    private final static Logger logger = LoggerFactory.getLogger(RpcRegister.class);

    private GrpcServerProperties properties;
    private String consulHost = null;
    private Integer consulPort = null;

    public RpcRegisterImpl(GrpcServerProperties properties) {
        this.properties = properties;

        try {
            URI uri = new URI(properties.getConsulHost());
            String host = uri.getHost();
            String scheme = uri.getScheme();
            int port = uri.getPort();
            consulHost = scheme + "://" + host;
            consulPort = port;
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void registerRpc(ServiceInfo serviceInfo) {
        if(consulHost == null) {
            logger.warn("no consul, cannot register {}", serviceInfo.getName());
            return;
        }
        ConsulClient agentClient = new ConsulClient(consulHost, consulPort);
        String serviceName = serviceInfo.getType();

        String localIp = properties.getLocalIp();
        if(localIp == null || localIp.isEmpty()) {
            InetAddress addr = null;
            try {
                addr = InetAddress.getLocalHost();
                localIp = addr.getHostAddress();
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        }
        String serviceId = localIp + ":" + properties.getPort() + "/" + serviceName;
        if(!StringUtils.isEmpty(serviceInfo.getName())){
            serviceId += "/" + serviceInfo.getName();
        } else {
            serviceId += "/" + "_noname";
        }
        if(!StringUtils.isEmpty(serviceInfo.getVersion())) {
            serviceId += "/" + serviceInfo.getVersion();
        } else {
            serviceId += "/" + "_noversion";
        }


        NewService newService = new NewService();
        newService.setName(serviceName);
        newService.setId(serviceId);
        newService.setAddress(localIp);
        newService.setPort(properties.getPort());
        List<String> tags = new ArrayList<>();
        Map<String, String> meta = new HashMap<>();
        meta.put("type", serviceName);
        if(!StringUtils.isEmpty(serviceInfo.getName())) {
            meta.put("name", serviceInfo.getName());
            tags.add(serviceInfo.getName());
        }
        if(!StringUtils.isEmpty(serviceInfo.getVersion())) {
            meta.put("version", serviceInfo.getVersion());
            tags.add(serviceInfo.getVersion());
        }
        newService.setMeta(meta);
        newService.setTags(tags);

        NewService.Check check = new NewService.Check();
        check.setGrpc(newService.getAddress() + ":" + newService.getPort() + "/" + serviceName);
        check.setInterval("10s");
        newService.setCheck(check);

        agentClient.agentServiceRegister(newService);
        logger.info("grpc service register to consul:{}", serviceInfo);

    }

    @Override
    public void unRegisterRpc(String serviceId) {

    }
}
