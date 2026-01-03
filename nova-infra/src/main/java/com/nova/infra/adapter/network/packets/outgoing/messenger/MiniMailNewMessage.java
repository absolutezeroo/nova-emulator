package com.nova.infra.adapter.network.packets.outgoing.messenger;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record MiniMailNewMessage(
    // No fields parsed
) implements IOutgoingPacket {}
