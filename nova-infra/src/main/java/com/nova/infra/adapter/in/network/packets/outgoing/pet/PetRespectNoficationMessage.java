package com.nova.infra.adapter.in.network.packets.outgoing.pet;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record PetRespectNoficationMessage(
    // No fields parsed
) implements IOutgoingPacket {}
