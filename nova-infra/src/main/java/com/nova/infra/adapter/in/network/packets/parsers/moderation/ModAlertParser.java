package com.nova.infra.adapter.in.network.packets.parsers.moderation;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.moderation.ModAlertMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses ModAlert packet from client.
 */
@ParsesPacket(Incoming.MODTOOL_SANCTION_ALERT)
public class ModAlertParser extends PacketParser<ModAlertMessageEvent> {
@Override
    public ModAlertMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ModAlertMessageEvent();
    }
}
