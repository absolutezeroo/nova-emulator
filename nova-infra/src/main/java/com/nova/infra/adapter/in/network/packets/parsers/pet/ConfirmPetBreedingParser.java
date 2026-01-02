package com.nova.infra.adapter.in.network.packets.parsers.pet;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.pet.ConfirmPetBreedingMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses ConfirmPetBreeding packet from client.
 */
@ParsesPacket(Incoming.PET_CONFIRM_BREEDING)
public class ConfirmPetBreedingParser extends PacketParser<ConfirmPetBreedingMessageEvent> {
@Override
    public ConfirmPetBreedingMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ConfirmPetBreedingMessageEvent();
    }
}
