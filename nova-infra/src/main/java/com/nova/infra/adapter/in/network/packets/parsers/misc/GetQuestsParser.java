package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetQuestsMessageEvent;

/**
 * Parses GetQuests packet from client.
 */
public class GetQuestsParser extends PacketParser<GetQuestsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_QUESTS;
    }

    @Override
    public GetQuestsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetQuestsMessageEvent();
    }
}
