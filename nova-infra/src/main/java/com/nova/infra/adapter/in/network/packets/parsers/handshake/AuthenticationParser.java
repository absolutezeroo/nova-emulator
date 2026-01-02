package com.nova.infra.adapter.in.network.packets.parsers.handshake;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.handshake.AuthenticationMessageEvent;

/**
 * Parses Authentication packet from client.
 */
public class AuthenticationParser extends PacketParser<AuthenticationMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.AUTHENTICATION;
    }

    @Override
    public AuthenticationMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new AuthenticationMessageEvent();
    }
}
