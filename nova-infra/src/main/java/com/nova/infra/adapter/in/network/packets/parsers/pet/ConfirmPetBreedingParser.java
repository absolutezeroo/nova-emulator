package com.nova.infra.adapter.in.network.packets.parsers.pet;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.pet.ConfirmPetBreedingMessageEvent;

/**
 * Parses ConfirmPetBreeding packet from client.
 */
public class ConfirmPetBreedingParser extends PacketParser<ConfirmPetBreedingMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.PET_CONFIRM_BREEDING;
    }

    @Override
    public ConfirmPetBreedingMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ConfirmPetBreedingMessageEvent();
    }
}
