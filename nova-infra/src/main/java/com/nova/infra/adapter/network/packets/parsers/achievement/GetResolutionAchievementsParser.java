package com.nova.infra.adapter.network.packets.parsers.achievement;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.achievement.GetResolutionAchievementsMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetResolutionAchievements packet from client.
 */
@ParsesPacket(Incoming.ACHIEVEMENT_RESOLUTION_OPEN)
public class GetResolutionAchievementsParser extends PacketParser<GetResolutionAchievementsMessageEvent> {
@Override
    public GetResolutionAchievementsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetResolutionAchievementsMessageEvent();
    }
}
