package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.WeeklyCompetitiveLeaderboardMessage;

/**
 * Composes WeeklyCompetitiveLeaderboard packet for client.
 */
public class WeeklyCompetitiveLeaderboardComposer extends PacketComposer<WeeklyCompetitiveLeaderboardMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.WEEKLY_COMPETITIVE_LEADERBOARD;
    }

    @Override
    protected void write(PacketBuffer packet, WeeklyCompetitiveLeaderboardMessage message) {
        // No fields to write
    }
}
