package org.asynchttpclient.ws;

import io.netty.handler.codec.http.websocketx.WebSocketFrame;

public interface AsyncWebSocketSender {
    void sendWebSocketFrame(WebSocketFrame frame);
}
