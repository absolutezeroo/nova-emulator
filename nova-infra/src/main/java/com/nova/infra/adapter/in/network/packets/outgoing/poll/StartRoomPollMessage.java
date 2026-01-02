package com.nova.infra.adapter.in.network.packets.outgoing.poll;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record StartRoomPollMessage(
    // No fields parsed
) implements IOutgoingPacket {}
