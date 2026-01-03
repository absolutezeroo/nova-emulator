package com.nova.infra.adapter.network.packets.outgoing.user;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record IgnoredUsersMessage(
    // No fields parsed
) implements IOutgoingPacket {}
