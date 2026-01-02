package com.nova.infra.adapter.in.network.packets.parsers.achievement;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.achievement.GetResolutionAchievementsMessageEvent;

/**
 * Parses GetResolutionAchievements packet from client.
 */
public class GetResolutionAchievementsParser extends PacketParser<GetResolutionAchievementsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ACHIEVEMENT_RESOLUTION_OPEN;
    }

    @Override
    public GetResolutionAchievementsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetResolutionAchievementsMessageEvent();
    }
}
