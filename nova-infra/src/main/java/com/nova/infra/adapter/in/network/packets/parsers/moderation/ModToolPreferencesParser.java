package com.nova.infra.adapter.in.network.packets.parsers.moderation;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.moderation.ModToolPreferencesMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
