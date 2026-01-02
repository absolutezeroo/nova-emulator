package com.nova.infra.adapter.in.network.packets.parsers.navigator;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.navigator.NavigatorDeleteSavedSearchMessageEvent;

/**
 * Parses NavigatorDeleteSavedSearch packet from client.
 */
public class NavigatorDeleteSavedSearchParser extends PacketParser<NavigatorDeleteSavedSearchMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.NAVIGATOR_DELETE_SAVED_SEARCH;
    }

    @Override
    public NavigatorDeleteSavedSearchMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new NavigatorDeleteSavedSearchMessageEvent();
    }
}
