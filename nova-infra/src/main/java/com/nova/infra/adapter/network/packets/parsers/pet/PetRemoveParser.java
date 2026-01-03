package com.nova.infra.adapter.network.packets.parsers.pet;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.pet.PetRemoveMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
