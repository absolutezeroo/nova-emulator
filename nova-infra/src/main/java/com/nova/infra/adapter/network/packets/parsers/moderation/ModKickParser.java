package com.nova.infra.adapter.network.packets.parsers.moderation;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.moderation.ModKickMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses ModKick packet from client.
 */
@ParsesPacket(Incoming.MODTOOL_SANCTION_KICK)
public class ModKickParser extends PacketParser<ModKickMessageEvent> {
@Override
    public ModKickMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ModKickMessageEvent();
    }
}
