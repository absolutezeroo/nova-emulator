package com.nova.infra.adapter.in.network.packets.outgoing.poll;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record PollContentsMessage(
    // No fields parsed
) implements IOutgoingPacket {}
