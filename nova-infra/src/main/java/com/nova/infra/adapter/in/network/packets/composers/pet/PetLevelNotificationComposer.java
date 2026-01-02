package com.nova.infra.adapter.in.network.packets.composers.pet;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.pet.PetLevelNotificationMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes PetLevelNotification packet for client.
 */
@ComposesPacket(Outgoing.PET_LEVEL_NOTIFICATION)
public class PetLevelNotificationComposer extends PacketComposer<PetLevelNotificationMessage> {
@Override
    protected void write(PacketBuffer packet, PetLevelNotificationMessage message) {
        packet.appendInt(message.petId());
        packet.appendString(message.petName());
        packet.appendInt(message.level());
    }
}
