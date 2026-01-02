package com.nova.infra.adapter.in.network.packets.incoming.misc;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record FurnitureStackHeightMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
