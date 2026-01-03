package com.nova.infra.adapter.network.packets.incoming.moderation;

import com.nova.infra.adapter.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record ModToolPreferencesMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
