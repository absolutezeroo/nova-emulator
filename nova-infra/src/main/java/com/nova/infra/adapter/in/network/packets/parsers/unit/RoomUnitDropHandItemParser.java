package com.nova.infra.adapter.in.network.packets.parsers.unit;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.unit.RoomUnitDropHandItemMessageEvent;

/**
 * Parses RoomUnitDropHandItem packet from client.
 */
public class RoomUnitDropHandItemParser extends PacketParser<RoomUnitDropHandItemMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.UNIT_DROP_HAND_ITEM;
    }

    @Override
    public RoomUnitDropHandItemMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitDropHandItemMessageEvent();
    }
}
