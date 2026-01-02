package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.HabboSearchMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses HabboSearch packet from client.
 */
@ParsesPacket(Incoming.HABBO_SEARCH)
public class HabboSearchParser extends PacketParser<HabboSearchMessageEvent> {
@Override
    public HabboSearchMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new HabboSearchMessageEvent();
    }
}
