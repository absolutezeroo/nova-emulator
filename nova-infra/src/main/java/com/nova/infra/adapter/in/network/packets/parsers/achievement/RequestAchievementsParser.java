package com.nova.infra.adapter.in.network.packets.parsers.achievement;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.achievement.RequestAchievementsMessageEvent;

/**
 * Parses RequestAchievements packet from client.
 */
public class RequestAchievementsParser extends PacketParser<RequestAchievementsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ACHIEVEMENT_LIST;
    }

    @Override
    public RequestAchievementsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RequestAchievementsMessageEvent();
    }
}
