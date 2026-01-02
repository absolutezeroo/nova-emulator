package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.WeeklyCompetitiveFriendsLeaderboardMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes WeeklyCompetitiveFriendsLeaderboard packet for client.
 */
@ComposesPacket(Outgoing.WEEKLY_COMPETITIVE_FRIENDS_LEADERBOARD)
public class WeeklyCompetitiveFriendsLeaderboardComposer extends PacketComposer<WeeklyCompetitiveFriendsLeaderboardMessage> {
@Override
    protected void write(PacketBuffer packet, WeeklyCompetitiveFriendsLeaderboardMessage message) {
        // No fields to write
    }
}
