package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ModerateMessageEvent;

/**
 * Parses Moderate packet from client.
 */
public class ModerateParser extends PacketParser<ModerateMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.FORUM_MODERATE_MESSAGE;
    }

    @Override
    public ModerateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ModerateMessageEvent();
    }
}
