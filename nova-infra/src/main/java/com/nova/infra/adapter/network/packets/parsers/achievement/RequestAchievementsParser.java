package com.nova.infra.adapter.network.packets.parsers.achievement;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.achievement.RequestAchievementsMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RequestAchievements packet from client.
 */
@ParsesPacket(Incoming.ACHIEVEMENT_LIST)
public class RequestAchievementsParser extends PacketParser<RequestAchievementsMessageEvent> {
@Override
    public RequestAchievementsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RequestAchievementsMessageEvent();
    }
}
