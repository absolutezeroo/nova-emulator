package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RateFlatMessageEvent;

/**
 * Parses RateFlat packet from client.
 */
public class RateFlatParser extends PacketParser<RateFlatMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_LIKE;
    }

    @Override
    public RateFlatMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RateFlatMessageEvent();
    }
}
