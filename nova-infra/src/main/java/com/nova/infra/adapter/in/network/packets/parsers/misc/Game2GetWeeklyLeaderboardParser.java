package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.Game2GetWeeklyLeaderboardMessageEvent;

/**
 * Parses Game2GetWeeklyLeaderboard packet from client.
 */
public class Game2GetWeeklyLeaderboardParser extends PacketParser<Game2GetWeeklyLeaderboardMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GAME2GETWEEKLYLEADERBOARD;
    }

    @Override
    public Game2GetWeeklyLeaderboardMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new Game2GetWeeklyLeaderboardMessageEvent();
    }
}
