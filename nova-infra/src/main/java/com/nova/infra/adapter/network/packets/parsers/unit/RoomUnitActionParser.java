package com.nova.infra.adapter.network.packets.parsers.unit;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.unit.RoomUnitActionMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
