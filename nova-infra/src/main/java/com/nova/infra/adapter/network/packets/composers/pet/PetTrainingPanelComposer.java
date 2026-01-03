package com.nova.infra.adapter.network.packets.composers.pet;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.pet.PetTrainingPanelMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes PetTrainingPanel packet for client.
 */
@ComposesPacket(Outgoing.PET_TRAINING_PANEL)
public class PetTrainingPanelComposer extends PacketComposer<PetTrainingPanelMessage> {
@Override
    protected void write(PacketBuffer packet, PetTrainingPanelMessage message) {
        // No fields to write
    }
}
