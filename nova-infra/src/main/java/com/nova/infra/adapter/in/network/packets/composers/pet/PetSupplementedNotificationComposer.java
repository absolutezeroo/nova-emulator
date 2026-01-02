package com.nova.infra.adapter.in.network.packets.composers.pet;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.pet.PetSupplementedNotificationMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes PetSupplementedNotification packet for client.
 */
@ComposesPacket(Outgoing.PET_SUPPLEMENT)
public class PetSupplementedNotificationComposer extends PacketComposer<PetSupplementedNotificationMessage> {
@Override
    protected void write(PacketBuffer packet, PetSupplementedNotificationMessage message) {
        packet.appendInt(message.petId());
        packet.appendInt(message.userId());
        packet.appendInt(message.supplementType());
    }
}
