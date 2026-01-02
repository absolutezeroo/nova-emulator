package com.nova.infra.adapter.in.network.packets.parsers.pet;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.pet.PetMountMessageEvent;

/**
 * Parses PetMount packet from client.
 */
public class PetMountParser extends PacketParser<PetMountMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.PET_MOUNT;
    }

    @Override
    public PetMountMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PetMountMessageEvent();
    }
}
