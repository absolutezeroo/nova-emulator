package com.nova.infra.adapter.network.packets.parsers.unit;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.unit.RoomUnitPostureMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomUnitPosture packet from client.
 */
@ParsesPacket(Incoming.UNIT_POSTURE)
public class RoomUnitPostureParser extends PacketParser<RoomUnitPostureMessageEvent> {
@Override
    public RoomUnitPostureMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitPostureMessageEvent();
    }
}
