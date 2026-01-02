package com.nova.infra.adapter.in.network.packets.parsers.unit;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.unit.RoomUnitTypingStartMessageEvent;

/**
 * Parses RoomUnitTypingStart packet from client.
 */
public class RoomUnitTypingStartParser extends PacketParser<RoomUnitTypingStartMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.UNIT_TYPING;
    }

    @Override
    public RoomUnitTypingStartMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitTypingStartMessageEvent();
    }
}
