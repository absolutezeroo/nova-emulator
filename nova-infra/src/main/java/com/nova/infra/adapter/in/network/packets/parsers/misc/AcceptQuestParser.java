package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.AcceptQuestMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses AcceptQuest packet from client.
 */
@ParsesPacket(Incoming.ACCEPT_QUEST)
public class AcceptQuestParser extends PacketParser<AcceptQuestMessageEvent> {
@Override
    public AcceptQuestMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new AcceptQuestMessageEvent();
    }
}
