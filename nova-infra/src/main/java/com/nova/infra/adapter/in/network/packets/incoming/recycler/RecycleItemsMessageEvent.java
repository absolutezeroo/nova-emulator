package com.nova.infra.adapter.in.network.packets.incoming.recycler;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record RecycleItemsMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
