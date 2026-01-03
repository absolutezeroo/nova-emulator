package com.nova.infra.adapter.network.packets.incoming.recycler;

import com.nova.infra.adapter.network.packets.IncomingPacket;

/**
 * Event received from client.
 */
public record RecycleItemsMessageEvent(
    // No fields parsed
) implements IncomingPacket {}
