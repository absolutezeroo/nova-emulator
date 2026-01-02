package com.nova.infra.adapter.in.network.packets.parsers.handshake;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.handshake.AuthenticationMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses Authentication packet from client.
 */
@ParsesPacket(Incoming.AUTHENTICATION)
public class AuthenticationParser extends PacketParser<AuthenticationMessageEvent> {
@Override
    public AuthenticationMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new AuthenticationMessageEvent();
    }
}
