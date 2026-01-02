package com.nova.infra.adapter.in.network.packets.parsers.pet;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.pet.CancelPetBreedingMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses CancelPetBreeding packet from client.
 */
@ParsesPacket(Incoming.PET_CANCEL_BREEDING)
public class CancelPetBreedingParser extends PacketParser<CancelPetBreedingMessageEvent> {
@Override
    public CancelPetBreedingMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CancelPetBreedingMessageEvent();
    }
}
