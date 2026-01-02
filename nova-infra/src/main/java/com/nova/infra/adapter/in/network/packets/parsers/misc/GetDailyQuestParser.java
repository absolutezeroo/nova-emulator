package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetDailyQuestMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetDailyQuest packet from client.
 */
@ParsesPacket(Incoming.GET_DAILY_QUEST)
public class GetDailyQuestParser extends PacketParser<GetDailyQuestMessageEvent> {
@Override
    public GetDailyQuestMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetDailyQuestMessageEvent();
    }
}
