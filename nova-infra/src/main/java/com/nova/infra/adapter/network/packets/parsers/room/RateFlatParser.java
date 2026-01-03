package com.nova.infra.adapter.network.packets.parsers.room;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.room.RateFlatMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RateFlat packet from client.
 */
@ParsesPacket(Incoming.ROOM_LIKE)
public class RateFlatParser extends PacketParser<RateFlatMessageEvent> {
@Override
    public RateFlatMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RateFlatMessageEvent();
    }
}
