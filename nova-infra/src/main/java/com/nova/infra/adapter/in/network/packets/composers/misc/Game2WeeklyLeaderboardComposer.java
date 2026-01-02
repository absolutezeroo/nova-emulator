package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.Game2WeeklyLeaderboardMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes Game2WeeklyLeaderboard packet for client.
 */
@ComposesPacket(Outgoing.WEEKLY_GAME2_LEADERBOARD)
public class Game2WeeklyLeaderboardComposer extends PacketComposer<Game2WeeklyLeaderboardMessage> {
@Override
    protected void write(PacketBuffer packet, Game2WeeklyLeaderboardMessage message) {
        packet.appendInt(message.year());
        packet.appendInt(message.week());
        packet.appendInt(message.maxOffset());
        packet.appendInt(message.currentOffset());
        packet.appendInt(message.minutesUntilReset());
    }
}
