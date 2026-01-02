package com.nova.infra.adapter.in.network.packets.composers.pet;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.pet.PetExperienceMessage;

/**
 * Composes PetExperience packet for client.
 */
public class PetExperienceComposer extends PacketComposer<PetExperienceMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.PET_EXPERIENCE;
    }

    @Override
    protected void write(PacketBuffer packet, PetExperienceMessage message) {
        packet.appendInt(message.petId());
        packet.appendInt(message.roomIndex());
        packet.appendInt(message.gainedExperience());
    }
}
