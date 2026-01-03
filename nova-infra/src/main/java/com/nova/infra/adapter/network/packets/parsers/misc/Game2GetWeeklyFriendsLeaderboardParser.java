package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.Game2GetWeeklyFriendsLeaderboardMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses Game2GetWeeklyFriendsLeaderboard packet from client.
 */
@ParsesPacket(Incoming.GAME2GETWEEKLYFRIENDSLEADERBOARD)
public class Game2GetWeeklyFriendsLeaderboardParser extends PacketParser<Game2GetWeeklyFriendsLeaderboardMessageEvent> {
@Override
    public Game2GetWeeklyFriendsLeaderboardMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new Game2GetWeeklyFriendsLeaderboardMessageEvent();
    }
}
