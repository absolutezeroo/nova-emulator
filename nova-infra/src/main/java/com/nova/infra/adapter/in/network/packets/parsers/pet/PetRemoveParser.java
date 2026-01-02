package com.nova.infra.adapter.in.network.packets.parsers.pet;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.pet.PetRemoveMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses PetRemove packet from client.
 */
@ParsesPacket(Incoming.PET_PICKUP)
public class PetRemoveParser extends PacketParser<PetRemoveMessageEvent> {
@Override
    public PetRemoveMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PetRemoveMessageEvent();
    }
}
