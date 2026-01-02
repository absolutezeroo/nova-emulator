package com.nova.infra.adapter.in.network.packets.parsers.navigator;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.navigator.NavigatorSearchMessageEvent;

/**
 * Parses NavigatorSearch packet from client.
 */
public class NavigatorSearchParser extends PacketParser<NavigatorSearchMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.NAVIGATOR_SEARCH;
    }

    @Override
    public NavigatorSearchMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new NavigatorSearchMessageEvent();
    }
}
