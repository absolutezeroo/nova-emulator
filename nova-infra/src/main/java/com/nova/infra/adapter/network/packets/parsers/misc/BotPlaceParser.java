package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.BotPlaceMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses BotPlace packet from client.
 */
@ParsesPacket(Incoming.BOT_PLACE)
public class BotPlaceParser extends PacketParser<BotPlaceMessageEvent> {
@Override
    public BotPlaceMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new BotPlaceMessageEvent();
    }
}
