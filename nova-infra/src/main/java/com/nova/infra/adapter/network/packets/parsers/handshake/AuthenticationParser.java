package com.nova.infra.adapter.network.packets.parsers.handshake;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.handshake.AuthenticationMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
