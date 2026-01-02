package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ClientHelloMessageEvent;

/**
 * Parses ClientHello packet from client.
 */
public class ClientHelloParser extends PacketParser<ClientHelloMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.RELEASE_VERSION;
    }

    @Override
    public ClientHelloMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ClientHelloMessageEvent();
    }
}
