package com.ecwid.consul.transport.async;

import com.ecwid.consul.transport.HttpRequest;
import com.ecwid.consul.transport.HttpResponse;
import com.ecwid.consul.transport.HttpTransport;
import com.ecwid.consul.transport.TransportException;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.RequestBuilder;
import org.asynchttpclient.Response;

import java.nio.charset.StandardCharsets;

public class AsyncHttpTransport implements HttpTransport {
    AsyncHttpClient client;

    public AsyncHttpTransport(AsyncHttpClient client) {
        this.client = client;
    }

    public AsyncHttpClient getClient() {
        return client;
    }

    @Override
    public HttpResponse makeGetRequest(HttpRequest request) {
        return execute(makeRequestBuilder(request).setMethod("GET"));
    }

    @Override
    public HttpResponse makePutRequest(HttpRequest request) {
        return execute(makeRequestBuilder(request).setMethod("PUT"));
    }

    @Override
    public HttpResponse makeDeleteRequest(HttpRequest request) {
        return execute(makeRequestBuilder(request).setMethod("DELETE"));
    }

    HttpResponse execute(RequestBuilder builder) {
        try {
            Response res = client.executeRequest(builder).get();
            int statusCode = res.getStatusCode();
            String statusMessage = res.getStatusText();
            String content = res.getResponseBody(StandardCharsets.UTF_8);

            Long consulIndex = parseUnsignedLong(res.getHeader("X-Consul-Index"));
            Boolean consulKnownLeader = parseBoolean(res.getHeader("X-Consul-Knownleader"));
            Long consulLastContact = parseUnsignedLong(res.getHeader("X-Consul-Lastcontact"));

            return new HttpResponse(statusCode, statusMessage, content, consulIndex, consulKnownLeader, consulLastContact);
        } catch (Throwable t) {
            throw new TransportException(t);
        }
    }

    private static RequestBuilder makeRequestBuilder(HttpRequest request) {
        RequestBuilder builder = new RequestBuilder();
        builder.setUrl(request.getUrl());
        if(request.getHeaders() != null) {
            request.getHeaders().forEach((k,v)->builder.setHeader(k,v));
        }

        String content = request.getContent();
        if(content != null && !content.isEmpty()) {
            builder.setBody(content);
        } else {
            byte[] data = request.getBinaryContent();
            if(data != null && data.length > 0) {
                builder.setBody(data);
            }
        }
        return builder;
    }

    private static Long parseUnsignedLong(String value) {
        if (value == null) {
            return null;
        }

        try {
            return Long.parseUnsignedLong(value);
        } catch (Exception e) {
            return null;
        }
    }

    private static Boolean parseBoolean(String value) {
        if (value == null) {
            return null;
        }

        if ("true".equals(value)) {
            return true;
        }

        if ("false".equals(value)) {
            return false;
        }

        return null;
    }
}
