package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.RedeemCommunityGoalPrizeMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses RedeemCommunityGoalPrize packet from client.
 */
@ParsesPacket(Incoming.REDEEM_COMMUNITY_GOAL_PRIZE)
public class RedeemCommunityGoalPrizeParser extends PacketParser<RedeemCommunityGoalPrizeMessageEvent> {
@Override
    public RedeemCommunityGoalPrizeMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RedeemCommunityGoalPrizeMessageEvent();
    }
}
