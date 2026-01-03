package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.Game2WeeklyFriendsLeaderboardMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes Game2WeeklyFriendsLeaderboard packet for client.
 */
@ComposesPacket(Outgoing.WEEKLY_GAME2_FRIENDS_LEADERBOARD)
public class Game2WeeklyFriendsLeaderboardComposer extends PacketComposer<Game2WeeklyFriendsLeaderboardMessage> {
@Override
    protected void write(PacketBuffer packet, Game2WeeklyFriendsLeaderboardMessage message) {
        // No fields to write
    }
}
