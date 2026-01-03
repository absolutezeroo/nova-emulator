package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.MyGuildBasesSearchMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses MyGuildBasesSearch packet from client.
 */
@ParsesPacket(Incoming.MY_GUILD_BASES_SEARCH)
public class MyGuildBasesSearchParser extends PacketParser<MyGuildBasesSearchMessageEvent> {
@Override
    public MyGuildBasesSearchMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new MyGuildBasesSearchMessageEvent();
    }
}
