package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.OpenQuestTrackerMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses OpenQuestTracker packet from client.
 */
@ParsesPacket(Incoming.OPEN_QUEST_TRACKER)
public class OpenQuestTrackerParser extends PacketParser<OpenQuestTrackerMessageEvent> {
@Override
    public OpenQuestTrackerMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new OpenQuestTrackerMessageEvent();
    }
}
