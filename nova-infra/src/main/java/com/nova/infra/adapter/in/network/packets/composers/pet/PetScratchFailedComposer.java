package com.nova.infra.adapter.in.network.packets.composers.pet;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.pet.PetScratchFailedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes PetScratchFailed packet for client.
 */
@ComposesPacket(Outgoing.PET_SCRATCH_FAILED)
public class PetScratchFailedComposer extends PacketComposer<PetScratchFailedMessage> {
@Override
    protected void write(PacketBuffer packet, PetScratchFailedMessage message) {
        // No fields to write
    }
}
