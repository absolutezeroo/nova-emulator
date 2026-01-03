package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.WeeklyCompetitiveLeaderboardMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes WeeklyCompetitiveLeaderboard packet for client.
 */
@ComposesPacket(Outgoing.WEEKLY_COMPETITIVE_LEADERBOARD)
public class WeeklyCompetitiveLeaderboardComposer extends PacketComposer<WeeklyCompetitiveLeaderboardMessage> {
@Override
    protected void write(PacketBuffer packet, WeeklyCompetitiveLeaderboardMessage message) {
        // No fields to write
    }
}
