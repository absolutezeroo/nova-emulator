package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ClientHelloMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses ClientHello packet from client.
 */
@ParsesPacket(Incoming.RELEASE_VERSION)
public class ClientHelloParser extends PacketParser<ClientHelloMessageEvent> {
@Override
    public ClientHelloMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ClientHelloMessageEvent();
    }
}
