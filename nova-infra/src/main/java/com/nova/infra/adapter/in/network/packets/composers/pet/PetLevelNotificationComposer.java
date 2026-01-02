package com.nova.infra.adapter.in.network.packets.composers.pet;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.pet.PetLevelNotificationMessage;

/**
 * Composes PetLevelNotification packet for client.
 */
public class PetLevelNotificationComposer extends PacketComposer<PetLevelNotificationMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.PET_LEVEL_NOTIFICATION;
    }

    @Override
    protected void write(PacketBuffer packet, PetLevelNotificationMessage message) {
        packet.appendInt(message.petId());
        packet.appendString(message.petName());
        packet.appendInt(message.level());
    }
}
