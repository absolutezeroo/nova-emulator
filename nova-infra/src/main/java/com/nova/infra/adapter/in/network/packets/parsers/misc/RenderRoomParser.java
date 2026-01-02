package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.RenderRoomMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses RenderRoom packet from client.
 */
@ParsesPacket(Incoming.RENDER_ROOM)
public class RenderRoomParser extends PacketParser<RenderRoomMessageEvent> {
@Override
    public RenderRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RenderRoomMessageEvent();
    }
}
