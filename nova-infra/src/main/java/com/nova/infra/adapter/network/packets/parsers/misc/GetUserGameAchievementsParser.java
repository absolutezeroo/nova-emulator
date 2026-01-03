package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetUserGameAchievementsMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetUserGameAchievements packet from client.
 */
@ParsesPacket(Incoming.GETUSERGAMEACHIEVEMENTSMESSAGE)
public class GetUserGameAchievementsParser extends PacketParser<GetUserGameAchievementsMessageEvent> {
@Override
    public GetUserGameAchievementsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetUserGameAchievementsMessageEvent();
    }
}
