package com.nova.infra.adapter.in.network.packets.composers.pet;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.pet.PetStatusUpdateMessage;

/**
 * Composes PetStatusUpdate packet for client.
 */
public class PetStatusUpdateComposer extends PacketComposer<PetStatusUpdateMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.PET_STATUS;
    }

    @Override
    protected void write(PacketBuffer packet, PetStatusUpdateMessage message) {
        packet.appendInt(message.roomIndex());
        packet.appendInt(message.petId());
        packet.appendBoolean(message.canBreed());
        packet.appendBoolean(message.canHarvest());
        packet.appendBoolean(message.canRevive());
        packet.appendBoolean(message.hasBreedingPermission());
    }
}
