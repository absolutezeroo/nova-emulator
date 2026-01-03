package com.nova.infra.adapter.network.packets.parsers.pet;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.pet.PetPlaceMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses PetPlace packet from client.
 */
@ParsesPacket(Incoming.PET_PLACE)
public class PetPlaceParser extends PacketParser<PetPlaceMessageEvent> {
@Override
    public PetPlaceMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PetPlaceMessageEvent();
    }
}
