package com.nova.infra.adapter.in.network.packets.parsers.pet;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.pet.PetRespectMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses PetRespect packet from client.
 */
@ParsesPacket(Incoming.PET_RESPECT)
public class PetRespectParser extends PacketParser<PetRespectMessageEvent> {
@Override
    public PetRespectMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PetRespectMessageEvent();
    }
}
