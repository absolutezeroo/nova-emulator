package com.nova.infra.adapter.network.packets.incoming.pet;

import com.nova.infra.adapter.network.packets.IncomingPacket;

/**
 * Event received from client.
 */
public record ConfirmPetBreedingMessageEvent(
    // No fields parsed
) implements IncomingPacket {}
