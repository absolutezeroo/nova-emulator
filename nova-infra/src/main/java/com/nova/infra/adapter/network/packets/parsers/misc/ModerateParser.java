package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.ModerateMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses Moderate packet from client.
 */
@ParsesPacket(Incoming.FORUM_MODERATE_MESSAGE)
public class ModerateParser extends PacketParser<ModerateMessageEvent> {
@Override
    public ModerateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ModerateMessageEvent();
    }
}
