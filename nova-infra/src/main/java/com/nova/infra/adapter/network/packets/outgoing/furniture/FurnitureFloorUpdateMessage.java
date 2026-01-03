package com.nova.infra.adapter.network.packets.outgoing.furniture;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record FurnitureFloorUpdateMessage(
    // No fields parsed
) implements IOutgoingPacket {}
