package com.nova.infra.adapter.network.packets.outgoing.crafting;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record CraftingResultMessage(
    boolean success
) implements OutgoingPacket {}
