package com.nova.infra.adapter.network.packets.outgoing.pet;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record PetStatusUpdateMessage(
    int roomIndex,
    int petId,
    boolean canBreed,
    boolean canHarvest,
    boolean canRevive,
    boolean hasBreedingPermission
) implements IOutgoingPacket {}
