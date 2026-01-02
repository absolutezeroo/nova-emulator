package com.nova.infra.adapter.in.network.packets.incoming.messenger;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record SendMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
