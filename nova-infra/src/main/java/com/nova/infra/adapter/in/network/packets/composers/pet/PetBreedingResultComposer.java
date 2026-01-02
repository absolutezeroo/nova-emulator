package com.nova.infra.adapter.in.network.packets.composers.pet;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.pet.PetBreedingResultMessage;

/**
 * Composes PetBreedingResult packet for client.
 */
public class PetBreedingResultComposer extends PacketComposer<PetBreedingResultMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.PET_BREEDING_RESULT;
    }

    @Override
    protected void write(PacketBuffer packet, PetBreedingResultMessage message) {
        // No fields to write
    }
}
