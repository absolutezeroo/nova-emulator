package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.MoodlightSettingsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
