package com.nova.infra.adapter.network.packets.parsers.pet;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.pet.PetMountMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses PetMount packet from client.
 */
@ParsesPacket(Incoming.PET_MOUNT)
public class PetMountParser extends PacketParser<PetMountMessageEvent> {
@Override
    public PetMountMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PetMountMessageEvent();
    }
}
