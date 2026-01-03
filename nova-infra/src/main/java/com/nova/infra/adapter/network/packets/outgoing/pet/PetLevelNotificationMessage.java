package com.nova.infra.adapter.network.packets.outgoing.pet;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record PetLevelNotificationMessage(
    int petId,
    String petName,
    int level
) implements IOutgoingPacket {}
