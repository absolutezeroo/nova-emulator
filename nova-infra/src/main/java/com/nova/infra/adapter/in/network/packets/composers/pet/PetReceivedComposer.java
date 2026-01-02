package com.nova.infra.adapter.in.network.packets.composers.pet;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.pet.PetReceivedMessage;

/**
 * Composes PetReceived packet for client.
 */
public class PetReceivedComposer extends PacketComposer<PetReceivedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.PET_RECEIVED;
    }

    @Override
    protected void write(PacketBuffer packet, PetReceivedMessage message) {
        // No fields to write
    }
}
