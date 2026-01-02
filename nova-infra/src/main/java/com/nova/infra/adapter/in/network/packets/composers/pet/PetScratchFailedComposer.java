package com.nova.infra.adapter.in.network.packets.composers.pet;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.pet.PetScratchFailedMessage;

/**
 * Composes PetScratchFailed packet for client.
 */
public class PetScratchFailedComposer extends PacketComposer<PetScratchFailedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.PET_SCRATCH_FAILED;
    }

    @Override
    protected void write(PacketBuffer packet, PetScratchFailedMessage message) {
        // No fields to write
    }
}
