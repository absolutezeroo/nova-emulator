package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GuildBaseSearchMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GuildBaseSearch packet from client.
 */
@ParsesPacket(Incoming.GUILD_BASE_SEARCH)
public class GuildBaseSearchParser extends PacketParser<GuildBaseSearchMessageEvent> {
@Override
    public GuildBaseSearchMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GuildBaseSearchMessageEvent();
    }
}
