package com.nova.infra.adapter.in.network.packets.parsers.navigator;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.navigator.NavigatorSearchOpenMessageEvent;

/**
 * Parses NavigatorSearchOpen packet from client.
 */
public class NavigatorSearchOpenParser extends PacketParser<NavigatorSearchOpenMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.NAVIGATOR_SEARCH_OPEN;
    }

    @Override
    public NavigatorSearchOpenMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new NavigatorSearchOpenMessageEvent();
    }
}
