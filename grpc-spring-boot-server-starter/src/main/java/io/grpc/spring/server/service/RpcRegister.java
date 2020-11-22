package io.grpc.spring.server.service;

public interface RpcRegister {
    void registerRpc(ServiceInfo serviceInfo);

    void unRegisterRpc(String serviceId);
}
