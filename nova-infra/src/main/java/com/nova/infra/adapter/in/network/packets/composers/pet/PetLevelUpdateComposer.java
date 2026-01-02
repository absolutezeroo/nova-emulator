package com.nova.infra.adapter.in.network.packets.composers.pet;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.pet.PetLevelUpdateMessage;

/**
 * Composes PetLevelUpdate packet for client.
 */
public class PetLevelUpdateComposer extends PacketComposer<PetLevelUpdateMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.PET_LEVEL_UPDATE;
    }

    @Override
    protected void write(PacketBuffer packet, PetLevelUpdateMessage message) {
        // No fields to write
    }
}
