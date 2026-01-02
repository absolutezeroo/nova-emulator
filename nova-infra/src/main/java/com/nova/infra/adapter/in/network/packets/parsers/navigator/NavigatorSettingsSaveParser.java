package com.nova.infra.adapter.in.network.packets.parsers.navigator;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.navigator.NavigatorSettingsSaveMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses NavigatorSettingsSave packet from client.
 */
@ParsesPacket(Incoming.NAVIGATOR_SETTINGS_SAVE)
public class NavigatorSettingsSaveParser extends PacketParser<NavigatorSettingsSaveMessageEvent> {
@Override
    public NavigatorSettingsSaveMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new NavigatorSettingsSaveMessageEvent();
    }
}
