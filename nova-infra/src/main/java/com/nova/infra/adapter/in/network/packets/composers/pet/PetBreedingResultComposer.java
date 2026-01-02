package com.nova.infra.adapter.in.network.packets.composers.pet;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.pet.PetBreedingResultMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes PetBreedingResult packet for client.
 */
@ComposesPacket(Outgoing.PET_BREEDING_RESULT)
public class PetBreedingResultComposer extends PacketComposer<PetBreedingResultMessage> {
@Override
    protected void write(PacketBuffer packet, PetBreedingResultMessage message) {
        // No fields to write
    }
}
