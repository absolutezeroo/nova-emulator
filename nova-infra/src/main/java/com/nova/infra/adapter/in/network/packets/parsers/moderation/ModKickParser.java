package com.nova.infra.adapter.in.network.packets.parsers.moderation;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.moderation.ModKickMessageEvent;

/**
 * Parses ModKick packet from client.
 */
public class ModKickParser extends PacketParser<ModKickMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MODTOOL_SANCTION_KICK;
    }

    @Override
    public ModKickMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ModKickMessageEvent();
    }
}
