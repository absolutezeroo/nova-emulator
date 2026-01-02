package com.nova.infra.adapter.in.network.packets.parsers.pet;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.pet.PetMountMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
