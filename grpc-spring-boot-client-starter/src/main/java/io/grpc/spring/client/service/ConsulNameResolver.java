package io.grpc.spring.client.service;

import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.health.HealthServicesRequest;
import com.ecwid.consul.v1.health.model.HealthService;
import com.google.common.base.Throwables;
import com.google.common.net.HostAndPort;
import io.grpc.Attributes;
import io.grpc.EquivalentAddressGroup;
import io.grpc.NameResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;
import java.net.URI;
import java.util.*;
import java.util.stream.Collectors;

public class ConsulNameResolver extends NameResolver {
    static final Logger logger = LoggerFactory.getLogger(ConsulNameResolver.class);

    // https://github.com/OrbitzWorldwide/consul-client/issues/135
    private static final long HEALTH_CACHE_WATCH_SECONDS = 20;
    private static final long HEALTH_CACHE_AWAIT_INIT_SECONDS = 0;

    private final ConsulClient client;

    private final URI targetUri;
    private Timer timer;
;

    /**
     * Creates a new instance.
     *
     * @param targetUri The target uri
     *
     * @param maybeConsulHostAndPort Optional Consul host and port combo, if the default shall not be used
     */
    public ConsulNameResolver(URI targetUri, Optional<HostAndPort> maybeConsulHostAndPort) {

        this.targetUri = targetUri;

        if (maybeConsulHostAndPort.isPresent()) {
            HostAndPort info = maybeConsulHostAndPort.get();
            client = new ConsulClient(info.getHost(), info.getPort());
        } else {
            client = new ConsulClient();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getServiceAuthority() {
        return this.targetUri.getAuthority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void start(Listener listener) {

        timer = new Timer(true);
        timer.schedule(new TimerTask(){

            @Override
            public void run() {
                String serviceName = getServiceAuthority();
                HealthServicesRequest.Builder builder = HealthServicesRequest.newBuilder();
                builder.setPassing(true);
                List<HealthService> nodes = client.getHealthServices(serviceName, builder.build()).getValue();
                updateListener(nodes, listener);
            }
        }, HEALTH_CACHE_AWAIT_INIT_SECONDS * 1000, HEALTH_CACHE_WATCH_SECONDS * 1000);



    }


    /**
     * Update the gRPC name resolver listener.
     *
     * @param healthyServices Health services to inform about
     *
     * @param listener gRPC name resolver listener
     */
    protected void updateListener(Collection<HealthService> healthyServices, Listener listener) {

        List<EquivalentAddressGroup> addressGroups = convertToEquivalentAddressGroups(healthyServices);

        logger.info("Updated gRPC name resolver listener for service: '{}' with address groups: {}",
                getServiceAuthority(), addressGroups);

        listener.onAddresses(addressGroups, Attributes.EMPTY);
    }

    /**
     * Convert healthy services obtained from Consul to the gRPC format.
     *
     * @param healthyServices Health services
     *
     * @return List of gRPC equivalent address groups
     */
    protected List<EquivalentAddressGroup> convertToEquivalentAddressGroups(Collection<HealthService> healthyServices) {

        return healthyServices.stream().map(sh -> {

            String address = resolveAddress(sh);
            int port = sh.getService().getPort();

            return new EquivalentAddressGroup(new InetSocketAddress(address, port));

        }).collect(Collectors.toList());
    }

    /**
     * Resolves the appropriate server address for the service given the
     * provided health information.
     *
     * If a service address is provided then that will be selected as it is more
     * specific, if not - then the node address will be picked.
     *
     * @param serviceHealth
     *            service health
     *
     * @return resolved address which typically will be an IP address but may
     *         also be a host name.
     */
    protected String resolveAddress(HealthService serviceHealth) {

        String serviceAddress = serviceHealth.getService().getAddress();
        if (serviceAddress != null && !serviceAddress.isEmpty()) {
            return serviceAddress;
        }

        return serviceHealth.getNode().getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void shutdown() {
        try {
            if(timer != null) {
                timer.cancel();
            }

        } catch (Exception e) {
            throw Throwables.propagate(e);
        }
    }
}
