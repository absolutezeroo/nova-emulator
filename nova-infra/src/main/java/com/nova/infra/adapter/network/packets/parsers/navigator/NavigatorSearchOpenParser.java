package com.nova.infra.adapter.network.packets.parsers.navigator;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.navigator.NavigatorSearchOpenMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses NavigatorSearchOpen packet from client.
 */
@ParsesPacket(Incoming.NAVIGATOR_SEARCH_OPEN)
public class NavigatorSearchOpenParser extends PacketParser<NavigatorSearchOpenMessageEvent> {
@Override
    public NavigatorSearchOpenMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new NavigatorSearchOpenMessageEvent();
    }
}
