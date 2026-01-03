package com.nova.infra.adapter.network.packets.outgoing.pet;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record PetExperienceMessage(
    int petId,
    int roomIndex,
    int gainedExperience
) implements OutgoingPacket {}
