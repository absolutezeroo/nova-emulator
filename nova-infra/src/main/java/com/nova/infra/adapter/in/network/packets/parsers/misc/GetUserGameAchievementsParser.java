package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetUserGameAchievementsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
