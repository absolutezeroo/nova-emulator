package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.RejectQuestMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RejectQuest packet from client.
 */
@ParsesPacket(Incoming.REJECT_QUEST)
public class RejectQuestParser extends PacketParser<RejectQuestMessageEvent> {
@Override
    public RejectQuestMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RejectQuestMessageEvent();
    }
}
