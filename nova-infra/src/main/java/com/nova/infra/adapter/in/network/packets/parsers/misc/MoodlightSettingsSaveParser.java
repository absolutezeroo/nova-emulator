package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.MoodlightSettingsSaveMessageEvent;

/**
 * Parses MoodlightSettingsSave packet from client.
 */
public class MoodlightSettingsSaveParser extends PacketParser<MoodlightSettingsSaveMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ITEM_DIMMER_SAVE;
    }

    @Override
    public MoodlightSettingsSaveMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new MoodlightSettingsSaveMessageEvent();
    }
}
