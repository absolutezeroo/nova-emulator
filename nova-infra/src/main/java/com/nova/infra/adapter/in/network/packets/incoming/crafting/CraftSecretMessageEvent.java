package com.nova.infra.adapter.in.network.packets.incoming.crafting;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record CraftSecretMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
