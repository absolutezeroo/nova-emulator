package com.nova.infra.adapter.in.network.packets.parsers.navigator;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.navigator.NavigatorSearchCloseMessageEvent;

/**
 * Parses NavigatorSearchClose packet from client.
 */
public class NavigatorSearchCloseParser extends PacketParser<NavigatorSearchCloseMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.NAVIGATOR_SEARCH_CLOSE;
    }

    @Override
    public NavigatorSearchCloseMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new NavigatorSearchCloseMessageEvent();
    }
}
