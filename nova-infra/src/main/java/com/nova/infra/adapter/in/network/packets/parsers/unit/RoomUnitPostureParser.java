package com.nova.infra.adapter.in.network.packets.parsers.unit;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.unit.RoomUnitPostureMessageEvent;

/**
 * Parses RoomUnitPosture packet from client.
 */
public class RoomUnitPostureParser extends PacketParser<RoomUnitPostureMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.UNIT_POSTURE;
    }

    @Override
    public RoomUnitPostureMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitPostureMessageEvent();
    }
}
