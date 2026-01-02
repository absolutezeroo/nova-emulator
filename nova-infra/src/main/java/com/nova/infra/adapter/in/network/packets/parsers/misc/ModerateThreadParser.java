package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ModerateThreadMessageEvent;

/**
 * Parses ModerateThread packet from client.
 */
public class ModerateThreadParser extends PacketParser<ModerateThreadMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.FORUM_MODERATE_THREAD;
    }

    @Override
    public ModerateThreadMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ModerateThreadMessageEvent();
    }
}
