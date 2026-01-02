package com.nova.infra.adapter.in.network.packets.parsers.pet;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.pet.PetPlaceMessageEvent;

/**
 * Parses PetPlace packet from client.
 */
public class PetPlaceParser extends PacketParser<PetPlaceMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.PET_PLACE;
    }

    @Override
    public PetPlaceMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PetPlaceMessageEvent();
    }
}
