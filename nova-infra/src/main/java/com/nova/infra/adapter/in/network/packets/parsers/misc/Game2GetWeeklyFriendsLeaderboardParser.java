package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.Game2GetWeeklyFriendsLeaderboardMessageEvent;

/**
 * Parses Game2GetWeeklyFriendsLeaderboard packet from client.
 */
public class Game2GetWeeklyFriendsLeaderboardParser extends PacketParser<Game2GetWeeklyFriendsLeaderboardMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GAME2GETWEEKLYFRIENDSLEADERBOARD;
    }

    @Override
    public Game2GetWeeklyFriendsLeaderboardMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new Game2GetWeeklyFriendsLeaderboardMessageEvent();
    }
}
