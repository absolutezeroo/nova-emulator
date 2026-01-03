package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.ModerateThreadMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses ModerateThread packet from client.
 */
@ParsesPacket(Incoming.FORUM_MODERATE_THREAD)
public class ModerateThreadParser extends PacketParser<ModerateThreadMessageEvent> {
@Override
    public ModerateThreadMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ModerateThreadMessageEvent();
    }
}
