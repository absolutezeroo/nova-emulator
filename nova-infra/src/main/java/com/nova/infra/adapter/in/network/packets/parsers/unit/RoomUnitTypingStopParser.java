package com.nova.infra.adapter.in.network.packets.parsers.unit;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.unit.RoomUnitTypingStopMessageEvent;

/**
 * Parses RoomUnitTypingStop packet from client.
 */
public class RoomUnitTypingStopParser extends PacketParser<RoomUnitTypingStopMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.UNIT_TYPING_STOP;
    }

    @Override
    public RoomUnitTypingStopMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitTypingStopMessageEvent();
    }
}
