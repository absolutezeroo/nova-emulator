package com.nova.infra.adapter.in.network.packets.parsers.pet;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.pet.PetRespectMessageEvent;

/**
 * Parses PetRespect packet from client.
 */
public class PetRespectParser extends PacketParser<PetRespectMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.PET_RESPECT;
    }

    @Override
    public PetRespectMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PetRespectMessageEvent();
    }
}
