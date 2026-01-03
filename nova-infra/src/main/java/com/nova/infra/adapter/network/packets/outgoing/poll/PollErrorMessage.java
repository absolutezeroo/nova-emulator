package com.nova.infra.adapter.network.packets.outgoing.poll;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record PollErrorMessage(
    // No fields parsed
) implements IOutgoingPacket {}
