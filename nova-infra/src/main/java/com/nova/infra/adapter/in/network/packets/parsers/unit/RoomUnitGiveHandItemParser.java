package com.nova.infra.adapter.in.network.packets.parsers.unit;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.unit.RoomUnitGiveHandItemMessageEvent;

/**
 * Parses RoomUnitGiveHandItem packet from client.
 */
public class RoomUnitGiveHandItemParser extends PacketParser<RoomUnitGiveHandItemMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.UNIT_GIVE_HANDITEM;
    }

    @Override
    public RoomUnitGiveHandItemMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitGiveHandItemMessageEvent();
    }
}
