package com.nova.infra.adapter.in.network.packets.parsers.unit;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.unit.RoomUnitActionMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomUnitAction packet from client.
 */
@ParsesPacket(Incoming.UNIT_ACTION)
public class RoomUnitActionParser extends PacketParser<RoomUnitActionMessageEvent> {
@Override
    public RoomUnitActionMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitActionMessageEvent();
    }
}
