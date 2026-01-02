package com.nova.infra.adapter.in.network.packets.parsers.navigator;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.navigator.NavigatorSettingsSaveMessageEvent;

/**
 * Parses NavigatorSettingsSave packet from client.
 */
public class NavigatorSettingsSaveParser extends PacketParser<NavigatorSettingsSaveMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.NAVIGATOR_SETTINGS_SAVE;
    }

    @Override
    public NavigatorSettingsSaveMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new NavigatorSettingsSaveMessageEvent();
    }
}
