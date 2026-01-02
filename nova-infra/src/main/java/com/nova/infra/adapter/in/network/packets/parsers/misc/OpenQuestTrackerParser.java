package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.OpenQuestTrackerMessageEvent;

/**
 * Parses OpenQuestTracker packet from client.
 */
public class OpenQuestTrackerParser extends PacketParser<OpenQuestTrackerMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.OPEN_QUEST_TRACKER;
    }

    @Override
    public OpenQuestTrackerMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new OpenQuestTrackerMessageEvent();
    }
}
