package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.MoodlightSettingsSaveMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses MoodlightSettingsSave packet from client.
 */
@ParsesPacket(Incoming.ITEM_DIMMER_SAVE)
public class MoodlightSettingsSaveParser extends PacketParser<MoodlightSettingsSaveMessageEvent> {
@Override
    public MoodlightSettingsSaveMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new MoodlightSettingsSaveMessageEvent();
    }
}
