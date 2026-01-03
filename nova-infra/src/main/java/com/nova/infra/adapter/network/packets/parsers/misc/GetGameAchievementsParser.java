package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetGameAchievementsMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetGameAchievements packet from client.
 */
@ParsesPacket(Incoming.GETGAMEACHIEVEMENTSMESSAGE)
public class GetGameAchievementsParser extends PacketParser<GetGameAchievementsMessageEvent> {
@Override
    public GetGameAchievementsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetGameAchievementsMessageEvent();
    }
}
