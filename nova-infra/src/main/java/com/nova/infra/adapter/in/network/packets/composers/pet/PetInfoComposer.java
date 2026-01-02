package com.nova.infra.adapter.in.network.packets.composers.pet;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.pet.PetInfoMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes PetInfo packet for client.
 */
@ComposesPacket(Outgoing.PET_INFO)
public class PetInfoComposer extends PacketComposer<PetInfoMessage> {
@Override
    protected void write(PacketBuffer packet, PetInfoMessage message) {
        packet.appendInt(message.id());
        packet.appendString(message.name());
        packet.appendInt(message.level());
        packet.appendInt(message.maximumLevel());
        packet.appendInt(message.experience());
        packet.appendInt(message.levelExperienceGoal());
        packet.appendInt(message.energy());
        packet.appendInt(message.maximumEnergy());
        packet.appendInt(message.happyness());
        packet.appendInt(message.maximumHappyness());
        packet.appendInt(message.respect());
        packet.appendInt(message.ownerId());
        packet.appendInt(message.age());
        packet.appendString(message.ownerName());
        packet.appendInt(message.rarityLevel());
        packet.appendBoolean(message.saddle());
        packet.appendBoolean(message.rider());
    }
}
