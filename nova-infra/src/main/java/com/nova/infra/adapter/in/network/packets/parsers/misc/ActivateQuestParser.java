package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ActivateQuestMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses ActivateQuest packet from client.
 */
@ParsesPacket(Incoming.ACTIVATE_QUEST)
public class ActivateQuestParser extends PacketParser<ActivateQuestMessageEvent> {
@Override
    public ActivateQuestMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ActivateQuestMessageEvent();
    }
}
