package com.nova.infra.adapter.network.packets.outgoing.pet;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record PetInfoMessage(
    int id,
    String name,
    int level,
    int maximumLevel,
    int experience,
    int levelExperienceGoal,
    int energy,
    int maximumEnergy,
    int happyness,
    int maximumHappyness,
    int respect,
    int ownerId,
    int age,
    String ownerName,
    int rarityLevel,
    boolean saddle,
    boolean rider
) implements OutgoingPacket {}
