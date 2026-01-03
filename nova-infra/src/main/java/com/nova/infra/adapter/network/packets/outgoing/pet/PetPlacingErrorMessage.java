package com.nova.infra.adapter.network.packets.outgoing.pet;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record PetPlacingErrorMessage(
    int errorCode
) implements IOutgoingPacket {}
