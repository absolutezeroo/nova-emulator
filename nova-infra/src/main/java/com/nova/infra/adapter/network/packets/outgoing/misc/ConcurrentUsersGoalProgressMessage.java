package com.nova.infra.adapter.network.packets.outgoing.misc;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record ConcurrentUsersGoalProgressMessage(
    int state,
    int userCount,
    int userCountGoal
) implements IOutgoingPacket {}
