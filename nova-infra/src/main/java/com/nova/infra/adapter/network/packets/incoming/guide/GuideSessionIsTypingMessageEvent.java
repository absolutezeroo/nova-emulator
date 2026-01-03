package com.nova.infra.adapter.network.packets.incoming.guide;

import com.nova.infra.adapter.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record GuideSessionIsTypingMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
