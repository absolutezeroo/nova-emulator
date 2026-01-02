package com.nova.infra.adapter.in.network.packets.parsers.moderation;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.moderation.ModToolSanctionMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses ModToolSanction packet from client.
 */
@ParsesPacket(Incoming.MODTOOL_SANCTION)
public class ModToolSanctionParser extends PacketParser<ModToolSanctionMessageEvent> {
@Override
    public ModToolSanctionMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ModToolSanctionMessageEvent();
    }
}
