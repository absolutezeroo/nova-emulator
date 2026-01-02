package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetQuestsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetQuests packet from client.
 */
@ParsesPacket(Incoming.GET_QUESTS)
public class GetQuestsParser extends PacketParser<GetQuestsMessageEvent> {
@Override
    public GetQuestsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetQuestsMessageEvent();
    }
}
