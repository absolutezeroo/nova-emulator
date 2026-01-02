package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.DefaultSanctionMessageEvent;

/**
 * Parses DefaultSanction packet from client.
 */
public class DefaultSanctionParser extends PacketParser<DefaultSanctionMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.DEFAULT_SANCTION;
    }

    @Override
    public DefaultSanctionMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new DefaultSanctionMessageEvent();
    }
}
