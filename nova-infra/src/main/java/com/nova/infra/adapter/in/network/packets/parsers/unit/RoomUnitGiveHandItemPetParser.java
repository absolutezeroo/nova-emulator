package com.nova.infra.adapter.in.network.packets.parsers.unit;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.unit.RoomUnitGiveHandItemPetMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomUnitGiveHandItemPet packet from client.
 */
@ParsesPacket(Incoming.UNIT_GIVE_HANDITEM_PET)
public class RoomUnitGiveHandItemPetParser extends PacketParser<RoomUnitGiveHandItemPetMessageEvent> {
@Override
    public RoomUnitGiveHandItemPetMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitGiveHandItemPetMessageEvent();
    }
}
