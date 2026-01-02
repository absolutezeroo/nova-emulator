package com.nova.infra.adapter.in.network.packets.parsers.moderation;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.moderation.ModBanMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses ModBan packet from client.
 */
@ParsesPacket(Incoming.MODTOOL_SANCTION_BAN)
public class ModBanParser extends PacketParser<ModBanMessageEvent> {
@Override
    public ModBanMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ModBanMessageEvent();
    }
}
