package com.nova.infra.adapter.network.packets.parsers.moderation;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.moderation.ModToolPreferencesMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses ModToolPreferences packet from client.
 */
@ParsesPacket(Incoming.MODTOOL_PREFERENCES)
public class ModToolPreferencesParser extends PacketParser<ModToolPreferencesMessageEvent> {
@Override
    public ModToolPreferencesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ModToolPreferencesMessageEvent();
    }
}
