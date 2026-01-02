package com.nova.infra.adapter.in.network.packets.composers.pet;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.pet.PetPlacingErrorMessage;

/**
 * Composes PetPlacingError packet for client.
 */
public class PetPlacingErrorComposer extends PacketComposer<PetPlacingErrorMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.PET_PLACING_ERROR;
    }

    @Override
    protected void write(PacketBuffer packet, PetPlacingErrorMessage message) {
        packet.appendInt(message.errorCode());
    }
}
