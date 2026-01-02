package com.nova.infra.adapter.in.network.packets.parsers.unit;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.unit.RoomUnitTypingStartMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomUnitTypingStart packet from client.
 */
@ParsesPacket(Incoming.UNIT_TYPING)
public class RoomUnitTypingStartParser extends PacketParser<RoomUnitTypingStartMessageEvent> {
@Override
    public RoomUnitTypingStartMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitTypingStartMessageEvent();
    }
}
