package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.PongMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses Pong packet from client.
 */
@ParsesPacket(Incoming.CLIENT_PONG)
public class PongParser extends PacketParser<PongMessageEvent> {
@Override
    public PongMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PongMessageEvent();
    }
}
