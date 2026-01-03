package com.nova.infra.adapter.network.packets.parsers.unit;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.unit.RoomUnitWalkMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomUnitWalk packet from client.
 */
@ParsesPacket(Incoming.UNIT_WALK)
public class RoomUnitWalkParser extends PacketParser<RoomUnitWalkMessageEvent> {
@Override
    public RoomUnitWalkMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitWalkMessageEvent();
    }
}
