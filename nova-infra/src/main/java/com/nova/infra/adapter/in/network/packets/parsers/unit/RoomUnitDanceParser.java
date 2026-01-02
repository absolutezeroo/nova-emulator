package com.nova.infra.adapter.in.network.packets.parsers.unit;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.unit.RoomUnitDanceMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomUnitDance packet from client.
 */
@ParsesPacket(Incoming.UNIT_DANCE)
public class RoomUnitDanceParser extends PacketParser<RoomUnitDanceMessageEvent> {
@Override
    public RoomUnitDanceMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitDanceMessageEvent();
    }
}
