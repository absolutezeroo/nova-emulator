package com.nova.infra.adapter.network.packets.composers.pet;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.pet.PetStatusUpdateMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes PetStatusUpdate packet for client.
 */
@ComposesPacket(Outgoing.PET_STATUS)
public class PetStatusUpdateComposer extends PacketComposer<PetStatusUpdateMessage> {
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
