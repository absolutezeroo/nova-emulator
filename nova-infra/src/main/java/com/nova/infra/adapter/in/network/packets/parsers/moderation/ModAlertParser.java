package com.nova.infra.adapter.in.network.packets.parsers.moderation;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.moderation.ModAlertMessageEvent;

/**
 * Parses ModAlert packet from client.
 */
public class ModAlertParser extends PacketParser<ModAlertMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MODTOOL_SANCTION_ALERT;
    }

    @Override
    public ModAlertMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ModAlertMessageEvent();
    }
}
