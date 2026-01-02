package com.nova.infra.adapter.in.network.packets.parsers.pet;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.pet.PetPlaceMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
