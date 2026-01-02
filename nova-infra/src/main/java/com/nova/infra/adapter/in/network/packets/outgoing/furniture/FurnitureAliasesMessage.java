package com.nova.infra.adapter.in.network.packets.outgoing.furniture;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record FurnitureAliasesMessage(
    // No fields parsed
) implements IOutgoingPacket {}
