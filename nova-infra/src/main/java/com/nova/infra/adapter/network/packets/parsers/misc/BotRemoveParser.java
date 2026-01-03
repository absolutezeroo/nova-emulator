package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.BotRemoveMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses BotRemove packet from client.
 */
@ParsesPacket(Incoming.BOT_PICKUP)
public class BotRemoveParser extends PacketParser<BotRemoveMessageEvent> {
@Override
    public BotRemoveMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new BotRemoveMessageEvent();
    }
}
