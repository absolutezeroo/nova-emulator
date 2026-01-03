package com.nova.infra.adapter.network.packets.composers.pet;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.pet.PetPlacingErrorMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes PetPlacingError packet for client.
 */
@ComposesPacket(Outgoing.PET_PLACING_ERROR)
public class PetPlacingErrorComposer extends PacketComposer<PetPlacingErrorMessage> {
@Override
    protected void write(PacketBuffer packet, PetPlacingErrorMessage message) {
        packet.appendInt(message.errorCode());
    }
}
