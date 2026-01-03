package com.nova.infra.adapter.network.packets.outgoing.pet;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record PetScratchFailedMessage(
    // No fields parsed
) implements OutgoingPacket {}
