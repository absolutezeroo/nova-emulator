package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.Game2WeeklyFriendsLeaderboardMessage;

/**
 * Composes Game2WeeklyFriendsLeaderboard packet for client.
 */
public class Game2WeeklyFriendsLeaderboardComposer extends PacketComposer<Game2WeeklyFriendsLeaderboardMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.WEEKLY_GAME2_FRIENDS_LEADERBOARD;
    }

    @Override
    protected void write(PacketBuffer packet, Game2WeeklyFriendsLeaderboardMessage message) {
        // No fields to write
    }
}
