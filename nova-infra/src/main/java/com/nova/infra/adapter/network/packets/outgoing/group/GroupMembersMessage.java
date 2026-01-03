package com.nova.infra.adapter.network.packets.outgoing.group;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record GroupMembersMessage(
    int groupId,
    String groupTitle,
    int roomId,
    String badge,
    int totalMembersCount
) implements OutgoingPacket {}
