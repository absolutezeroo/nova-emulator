package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.Game2WeeklyLeaderboardMessage;

/**
 * Composes Game2WeeklyLeaderboard packet for client.
 */
public class Game2WeeklyLeaderboardComposer extends PacketComposer<Game2WeeklyLeaderboardMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.WEEKLY_GAME2_LEADERBOARD;
    }

    @Override
    protected void write(PacketBuffer packet, Game2WeeklyLeaderboardMessage message) {
        packet.appendInt(message.year());
        packet.appendInt(message.week());
        packet.appendInt(message.maxOffset());
        packet.appendInt(message.currentOffset());
        packet.appendInt(message.minutesUntilReset());
    }
}
