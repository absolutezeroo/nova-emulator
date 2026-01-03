package com.nova.infra.adapter.network.packets.composers.pet;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.pet.PetRespectNoficationMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes PetRespectNofication packet for client.
 */
@ComposesPacket(Outgoing.PET_RESPECTED)
public class PetRespectNoficationComposer extends PacketComposer<PetRespectNoficationMessage> {
@Override
    protected void write(PacketBuffer packet, PetRespectNoficationMessage message) {
        // No fields to write
    }
}
