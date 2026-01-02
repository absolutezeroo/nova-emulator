package com.nova.infra.adapter.in.network.packets.parsers.pet;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.pet.PetSelectedMessageEvent;

/**
 * Parses PetSelected packet from client.
 */
public class PetSelectedParser extends PacketParser<PetSelectedMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.PET_SELECTED;
    }

    @Override
    public PetSelectedMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PetSelectedMessageEvent();
    }
}
