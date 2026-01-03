package com.nova.infra.adapter.network.packets.outgoing.group;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record PostMessage(
    int groupId,
    int threadId
) implements IOutgoingPacket {}
