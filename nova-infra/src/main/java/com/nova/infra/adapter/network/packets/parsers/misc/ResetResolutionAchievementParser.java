package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.ResetResolutionAchievementMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses ResetResolutionAchievement packet from client.
 */
@ParsesPacket(Incoming.RESETRESOLUTIONACHIEVEMENTMESSAGE)
public class ResetResolutionAchievementParser extends PacketParser<ResetResolutionAchievementMessageEvent> {
@Override
    public ResetResolutionAchievementMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ResetResolutionAchievementMessageEvent();
    }
}
