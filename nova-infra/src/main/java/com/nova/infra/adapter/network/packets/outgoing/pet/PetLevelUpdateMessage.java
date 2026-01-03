package com.nova.infra.adapter.network.packets.outgoing.pet;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record PetLevelUpdateMessage(
    // No fields parsed
) implements IOutgoingPacket {}
