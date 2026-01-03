package com.nova.infra.adapter.network.packets.outgoing.crafting;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record CraftableProductsMessage(
    // No fields parsed
) implements OutgoingPacket {}
