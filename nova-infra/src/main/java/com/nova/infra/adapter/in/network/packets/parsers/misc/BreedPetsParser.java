package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.BreedPetsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses BreedPets packet from client.
 */
@ParsesPacket(Incoming.PETS_BREED)
public class BreedPetsParser extends PacketParser<BreedPetsMessageEvent> {
@Override
    public BreedPetsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new BreedPetsMessageEvent();
    }
}
