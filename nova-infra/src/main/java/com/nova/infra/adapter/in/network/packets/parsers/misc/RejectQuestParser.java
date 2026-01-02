package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.RejectQuestMessageEvent;

/**
 * Parses RejectQuest packet from client.
 */
public class RejectQuestParser extends PacketParser<RejectQuestMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.REJECT_QUEST;
    }

    @Override
    public RejectQuestMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RejectQuestMessageEvent();
    }
}
