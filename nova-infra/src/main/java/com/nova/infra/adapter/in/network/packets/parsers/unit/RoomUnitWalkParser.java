package com.nova.infra.adapter.in.network.packets.parsers.unit;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.unit.RoomUnitWalkMessageEvent;

/**
 * Parses RoomUnitWalk packet from client.
 */
public class RoomUnitWalkParser extends PacketParser<RoomUnitWalkMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.UNIT_WALK;
    }

    @Override
    public RoomUnitWalkMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitWalkMessageEvent();
    }
}
