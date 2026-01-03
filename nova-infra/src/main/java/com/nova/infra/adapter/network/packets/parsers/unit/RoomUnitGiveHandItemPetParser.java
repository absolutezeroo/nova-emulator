package com.nova.infra.adapter.network.packets.parsers.unit;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.unit.RoomUnitGiveHandItemPetMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
