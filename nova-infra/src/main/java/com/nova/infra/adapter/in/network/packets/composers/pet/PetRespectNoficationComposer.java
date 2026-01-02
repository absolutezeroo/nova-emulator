package com.nova.infra.adapter.in.network.packets.composers.pet;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.pet.PetRespectNoficationMessage;

/**
 * Composes PetRespectNofication packet for client.
 */
public class PetRespectNoficationComposer extends PacketComposer<PetRespectNoficationMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.PET_RESPECTED;
    }

    @Override
    protected void write(PacketBuffer packet, PetRespectNoficationMessage message) {
        // No fields to write
    }
}
