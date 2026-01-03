package com.nova.infra.adapter.network.packets.parsers.unit;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.unit.RoomUnitTypingStopMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomUnitTypingStop packet from client.
 */
@ParsesPacket(Incoming.UNIT_TYPING_STOP)
public class RoomUnitTypingStopParser extends PacketParser<RoomUnitTypingStopMessageEvent> {
@Override
    public RoomUnitTypingStopMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitTypingStopMessageEvent();
    }
}
