package com.nova.infra.adapter.in.network.packets.parsers.unit;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.unit.RoomUnitDanceMessageEvent;

/**
 * Parses RoomUnitDance packet from client.
 */
public class RoomUnitDanceParser extends PacketParser<RoomUnitDanceMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.UNIT_DANCE;
    }

    @Override
    public RoomUnitDanceMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitDanceMessageEvent();
    }
}
