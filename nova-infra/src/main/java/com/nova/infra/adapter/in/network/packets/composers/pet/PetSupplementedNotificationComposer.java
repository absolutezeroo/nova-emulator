package com.nova.infra.adapter.in.network.packets.composers.pet;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.pet.PetSupplementedNotificationMessage;

/**
 * Composes PetSupplementedNotification packet for client.
 */
public class PetSupplementedNotificationComposer extends PacketComposer<PetSupplementedNotificationMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.PET_SUPPLEMENT;
    }

    @Override
    protected void write(PacketBuffer packet, PetSupplementedNotificationMessage message) {
        packet.appendInt(message.petId());
        packet.appendInt(message.userId());
        packet.appendInt(message.supplementType());
    }
}
