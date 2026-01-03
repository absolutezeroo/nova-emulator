package com.nova.infra.adapter.network.packets.parsers.pet;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.pet.PetMoveMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses PetMove packet from client.
 */
@ParsesPacket(Incoming.PET_MOVE)
public class PetMoveParser extends PacketParser<PetMoveMessageEvent> {
@Override
    public PetMoveMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PetMoveMessageEvent();
    }
}
