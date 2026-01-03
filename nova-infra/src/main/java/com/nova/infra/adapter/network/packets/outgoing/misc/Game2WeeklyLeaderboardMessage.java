package com.nova.infra.adapter.network.packets.outgoing.misc;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record Game2WeeklyLeaderboardMessage(
    int year,
    int week,
    int maxOffset,
    int currentOffset,
    int minutesUntilReset
) implements IOutgoingPacket {}
