package com.nova.infra.adapter.network.packets.outgoing.group;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record GuildForumThreadsMessage(
    int groupId,
    int startIndex,
    int amount
) implements OutgoingPacket {}
