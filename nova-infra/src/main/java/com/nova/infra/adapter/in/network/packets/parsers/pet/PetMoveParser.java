package com.nova.infra.adapter.in.network.packets.parsers.pet;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.pet.PetMoveMessageEvent;

/**
 * Parses PetMove packet from client.
 */
public class PetMoveParser extends PacketParser<PetMoveMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.PET_MOVE;
    }

    @Override
    public PetMoveMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PetMoveMessageEvent();
    }
}
