package io.grpc.spring.server.configure;

import com.ecwid.consul.transport.async.AsyncHttpTransport;
import com.ecwid.consul.v1.ConsulRawClient;
import org.asynchttpclient.AsyncHttpClient;

public class ConsulInit {
    public static void initHttpClient(AsyncHttpClient client) {
        ConsulRawClient.setDefaultHttpTransport(new AsyncHttpTransport(client));
    }
}
