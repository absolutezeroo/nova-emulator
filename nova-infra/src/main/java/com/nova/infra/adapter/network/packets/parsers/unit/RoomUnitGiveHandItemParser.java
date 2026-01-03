package com.nova.infra.adapter.network.packets.parsers.unit;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.unit.RoomUnitGiveHandItemMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomUnitGiveHandItem packet from client.
 */
@ParsesPacket(Incoming.UNIT_GIVE_HANDITEM)
public class RoomUnitGiveHandItemParser extends PacketParser<RoomUnitGiveHandItemMessageEvent> {
@Override
    public RoomUnitGiveHandItemMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitGiveHandItemMessageEvent();
    }
}
