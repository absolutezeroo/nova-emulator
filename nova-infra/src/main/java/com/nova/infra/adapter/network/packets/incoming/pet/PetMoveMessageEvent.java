package com.nova.infra.adapter.network.packets.incoming.pet;

import com.nova.infra.adapter.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record PetMoveMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
