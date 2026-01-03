package com.nova.infra.adapter.network.packets.composers.pet;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.pet.PetLevelUpdateMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes PetLevelUpdate packet for client.
 */
@ComposesPacket(Outgoing.PET_LEVEL_UPDATE)
public class PetLevelUpdateComposer extends PacketComposer<PetLevelUpdateMessage> {
@Override
    protected void write(PacketBuffer packet, PetLevelUpdateMessage message) {
        // No fields to write
    }
}
