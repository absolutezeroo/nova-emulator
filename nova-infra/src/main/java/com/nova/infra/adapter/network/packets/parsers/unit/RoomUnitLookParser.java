package com.nova.infra.adapter.network.packets.parsers.unit;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.unit.RoomUnitLookMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomUnitLook packet from client.
 */
@ParsesPacket(Incoming.UNIT_LOOK)
public class RoomUnitLookParser extends PacketParser<RoomUnitLookMessageEvent> {
@Override
    public RoomUnitLookMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitLookMessageEvent();
    }
}
