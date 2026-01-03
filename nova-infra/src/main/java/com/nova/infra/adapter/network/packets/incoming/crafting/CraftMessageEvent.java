package com.nova.infra.adapter.network.packets.incoming.crafting;

import com.nova.infra.adapter.network.packets.IncomingPacket;

/**
 * Event received from client.
 */
public record CraftMessageEvent(
    // No fields parsed
) implements IncomingPacket {}
