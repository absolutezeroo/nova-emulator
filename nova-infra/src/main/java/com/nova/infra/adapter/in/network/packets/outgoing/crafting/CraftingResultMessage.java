package com.nova.infra.adapter.in.network.packets.outgoing.crafting;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record CraftingResultMessage(
    boolean success
) implements IOutgoingPacket {}
