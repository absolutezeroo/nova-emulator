package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetWeeklyGameRewardMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetWeeklyGameReward packet from client.
 */
@ParsesPacket(Incoming.GAMES_INIT)
public class GetWeeklyGameRewardParser extends PacketParser<GetWeeklyGameRewardMessageEvent> {
@Override
    public GetWeeklyGameRewardMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetWeeklyGameRewardMessageEvent();
    }
}
