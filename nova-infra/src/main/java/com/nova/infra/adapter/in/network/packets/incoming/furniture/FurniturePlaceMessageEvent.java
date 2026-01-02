package com.nova.infra.adapter.in.network.packets.incoming.furniture;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record FurniturePlaceMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
