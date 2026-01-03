package com.nova.infra.adapter.network.packets.composers.pet;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.pet.PetReceivedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes PetReceived packet for client.
 */
@ComposesPacket(Outgoing.PET_RECEIVED)
public class PetReceivedComposer extends PacketComposer<PetReceivedMessage> {
@Override
    protected void write(PacketBuffer packet, PetReceivedMessage message) {
        // No fields to write
    }
}
