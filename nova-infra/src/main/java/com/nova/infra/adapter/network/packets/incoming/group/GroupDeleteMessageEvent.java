package com.nova.infra.adapter.network.packets.incoming.group;

import com.nova.infra.adapter.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record GroupDeleteMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
