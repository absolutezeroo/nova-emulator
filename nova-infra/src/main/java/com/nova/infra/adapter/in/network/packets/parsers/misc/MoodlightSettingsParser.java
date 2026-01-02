package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.MoodlightSettingsMessageEvent;

/**
 * Parses MoodlightSettings packet from client.
 */
public class MoodlightSettingsParser extends PacketParser<MoodlightSettingsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ITEM_DIMMER_SETTINGS;
    }

    @Override
    public MoodlightSettingsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new MoodlightSettingsMessageEvent();
    }
}
