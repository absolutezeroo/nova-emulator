package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.CancelQuestMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses CancelQuest packet from client.
 */
@ParsesPacket(Incoming.CANCEL_QUEST)
public class CancelQuestParser extends PacketParser<CancelQuestMessageEvent> {
@Override
    public CancelQuestMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CancelQuestMessageEvent();
    }
}
