package com.nova.infra.adapter.in.network.packets.parsers.unit;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.unit.RoomUnitLookMessageEvent;

/**
 * Parses RoomUnitLook packet from client.
 */
public class RoomUnitLookParser extends PacketParser<RoomUnitLookMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.UNIT_LOOK;
    }

    @Override
    public RoomUnitLookMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitLookMessageEvent();
    }
}
