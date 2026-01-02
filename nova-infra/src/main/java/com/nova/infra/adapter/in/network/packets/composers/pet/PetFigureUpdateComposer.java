package com.nova.infra.adapter.in.network.packets.composers.pet;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.pet.PetFigureUpdateMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes PetFigureUpdate packet for client.
 */
@ComposesPacket(Outgoing.PET_FIGURE_UPDATE)
public class PetFigureUpdateComposer extends PacketComposer<PetFigureUpdateMessage> {
@Override
    protected void write(PacketBuffer packet, PetFigureUpdateMessage message) {
        packet.appendInt(message.roomIndex());
        packet.appendInt(message.petId());
        packet.appendBoolean(message.hasSaddle());
        packet.appendBoolean(message.isRiding());
    }
}
