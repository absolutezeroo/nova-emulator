package com.nova.infra.adapter.in.network.packets.parsers.moderation;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.moderation.ModToolPreferencesMessageEvent;

/**
 * Parses ModToolPreferences packet from client.
 */
public class ModToolPreferencesParser extends PacketParser<ModToolPreferencesMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MODTOOL_PREFERENCES;
    }

    @Override
    public ModToolPreferencesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ModToolPreferencesMessageEvent();
    }
}
