package com.nova.infra.adapter.in.network.packets.outgoing.group;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record GroupMembersMessage(
    int groupId,
    String groupTitle,
    int roomId,
    String badge,
    int totalMembersCount
) implements IOutgoingPacket {}
