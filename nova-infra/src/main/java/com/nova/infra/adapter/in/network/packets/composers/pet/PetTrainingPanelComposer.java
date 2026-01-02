package com.nova.infra.adapter.in.network.packets.composers.pet;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.pet.PetTrainingPanelMessage;

/**
 * Composes PetTrainingPanel packet for client.
 */
public class PetTrainingPanelComposer extends PacketComposer<PetTrainingPanelMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.PET_TRAINING_PANEL;
    }

    @Override
    protected void write(PacketBuffer packet, PetTrainingPanelMessage message) {
        // No fields to write
    }
}
