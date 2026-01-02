package com.nova.infra.adapter.in.network.packets.parsers.unit;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.unit.RoomUnitActionMessageEvent;

/**
 * Parses RoomUnitAction packet from client.
 */
public class RoomUnitActionParser extends PacketParser<RoomUnitActionMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.UNIT_ACTION;
    }

    @Override
    public RoomUnitActionMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitActionMessageEvent();
    }
}
