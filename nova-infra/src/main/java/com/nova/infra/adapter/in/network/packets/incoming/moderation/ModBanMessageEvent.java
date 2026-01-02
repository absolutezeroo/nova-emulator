package com.nova.infra.adapter.in.network.packets.incoming.moderation;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record ModBanMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
