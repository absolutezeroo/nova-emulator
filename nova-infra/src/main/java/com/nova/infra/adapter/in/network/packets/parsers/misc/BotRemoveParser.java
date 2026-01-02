package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.BotRemoveMessageEvent;

/**
 * Parses BotRemove packet from client.
 */
public class BotRemoveParser extends PacketParser<BotRemoveMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.BOT_PICKUP;
    }

    @Override
    public BotRemoveMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new BotRemoveMessageEvent();
    }
}
