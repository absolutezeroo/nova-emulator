package com.nova.infra.adapter.in.network.packets.composers.pet;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.pet.PetFigureUpdateMessage;

/**
 * Composes PetFigureUpdate packet for client.
 */
public class PetFigureUpdateComposer extends PacketComposer<PetFigureUpdateMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.PET_FIGURE_UPDATE;
    }

    @Override
    protected void write(PacketBuffer packet, PetFigureUpdateMessage message) {
        packet.appendInt(message.roomIndex());
        packet.appendInt(message.petId());
        packet.appendBoolean(message.hasSaddle());
        packet.appendBoolean(message.isRiding());
    }
}
