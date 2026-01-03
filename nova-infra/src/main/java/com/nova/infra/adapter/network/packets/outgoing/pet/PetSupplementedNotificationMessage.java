package com.nova.infra.adapter.network.packets.outgoing.pet;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record PetSupplementedNotificationMessage(
    int petId,
    int userId,
    int supplementType
) implements OutgoingPacket {}
