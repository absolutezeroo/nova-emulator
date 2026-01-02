package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.DefaultSanctionMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses DefaultSanction packet from client.
 */
@ParsesPacket(Incoming.DEFAULT_SANCTION)
public class DefaultSanctionParser extends PacketParser<DefaultSanctionMessageEvent> {
@Override
    public DefaultSanctionMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new DefaultSanctionMessageEvent();
    }
}
