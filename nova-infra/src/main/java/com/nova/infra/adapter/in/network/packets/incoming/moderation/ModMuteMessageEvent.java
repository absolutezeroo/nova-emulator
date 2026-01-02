package com.nova.infra.adapter.in.network.packets.incoming.moderation;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record ModMuteMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
