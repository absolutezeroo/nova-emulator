package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.BreedPetsMessageEvent;

/**
 * Parses BreedPets packet from client.
 */
public class BreedPetsParser extends PacketParser<BreedPetsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.PETS_BREED;
    }

    @Override
    public BreedPetsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new BreedPetsMessageEvent();
    }
}
