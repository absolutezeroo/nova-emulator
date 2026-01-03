package com.nova.infra.adapter.network.packets.outgoing.group;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record ThreadMessagesMessage(
    int groupId,
    int threadId,
    int startIndex,
    int amount
) implements IOutgoingPacket {}
