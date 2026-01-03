package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.MoodlightSettingsMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses MoodlightSettings packet from client.
 */
@ParsesPacket(Incoming.ITEM_DIMMER_SETTINGS)
public class MoodlightSettingsParser extends PacketParser<MoodlightSettingsMessageEvent> {
@Override
    public MoodlightSettingsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new MoodlightSettingsMessageEvent();
    }
}
