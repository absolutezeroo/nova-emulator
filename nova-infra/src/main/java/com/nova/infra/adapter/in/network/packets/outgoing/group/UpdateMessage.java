package com.nova.infra.adapter.in.network.packets.outgoing.group;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record UpdateMessage(
    int groupId,
    int threadId
) implements IOutgoingPacket {}
