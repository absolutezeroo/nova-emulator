package com.nova.infra.adapter.in.network.packets.parsers.navigator;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.navigator.NavigatorSearchSaveMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses NavigatorSearchSave packet from client.
 */
@ParsesPacket(Incoming.NAVIGATOR_SEARCH_SAVE)
public class NavigatorSearchSaveParser extends PacketParser<NavigatorSearchSaveMessageEvent> {
@Override
    public NavigatorSearchSaveMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new NavigatorSearchSaveMessageEvent();
    }
}
