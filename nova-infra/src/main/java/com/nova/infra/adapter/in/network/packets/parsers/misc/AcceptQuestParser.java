package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.AcceptQuestMessageEvent;

/**
 * Parses AcceptQuest packet from client.
 */
public class AcceptQuestParser extends PacketParser<AcceptQuestMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ACCEPT_QUEST;
    }

    @Override
    public AcceptQuestMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new AcceptQuestMessageEvent();
    }
}
