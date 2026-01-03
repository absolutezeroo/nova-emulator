package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.Game2GetWeeklyLeaderboardMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses Game2GetWeeklyLeaderboard packet from client.
 */
@ParsesPacket(Incoming.GAME2GETWEEKLYLEADERBOARD)
public class Game2GetWeeklyLeaderboardParser extends PacketParser<Game2GetWeeklyLeaderboardMessageEvent> {
@Override
    public Game2GetWeeklyLeaderboardMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new Game2GetWeeklyLeaderboardMessageEvent();
    }
}
