package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.BotRemoveMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
