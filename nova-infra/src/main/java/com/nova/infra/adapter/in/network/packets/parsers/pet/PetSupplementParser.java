package com.nova.infra.adapter.in.network.packets.parsers.pet;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.pet.PetSupplementMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses PetSupplement packet from client.
 */
@ParsesPacket(Incoming.PET_SUPPLEMENT)
public class PetSupplementParser extends PacketParser<PetSupplementMessageEvent> {
@Override
    public PetSupplementMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PetSupplementMessageEvent();
    }
}
