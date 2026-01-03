package com.nova.infra.adapter.network.packets.outgoing.poll;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record PollContentsMessage(
    // No fields parsed
) implements OutgoingPacket {}
