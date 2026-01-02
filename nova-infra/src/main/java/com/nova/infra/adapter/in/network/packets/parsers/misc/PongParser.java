package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.PongMessageEvent;

/**
 * Parses Pong packet from client.
 */
public class PongParser extends PacketParser<PongMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.CLIENT_PONG;
    }

    @Override
    public PongMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PongMessageEvent();
    }
}
