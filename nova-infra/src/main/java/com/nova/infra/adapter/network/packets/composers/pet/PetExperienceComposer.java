package com.nova.infra.adapter.network.packets.composers.pet;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.pet.PetExperienceMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes PetExperience packet for client.
 */
@ComposesPacket(Outgoing.PET_EXPERIENCE)
public class PetExperienceComposer extends PacketComposer<PetExperienceMessage> {
@Override
    protected void write(PacketBuffer packet, PetExperienceMessage message) {
        packet.appendInt(message.petId());
        packet.appendInt(message.roomIndex());
        packet.appendInt(message.gainedExperience());
    }
}
