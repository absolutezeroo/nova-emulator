package com.nova.infra.adapter.network.packets.parsers.moderation;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.moderation.ModAlertMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
