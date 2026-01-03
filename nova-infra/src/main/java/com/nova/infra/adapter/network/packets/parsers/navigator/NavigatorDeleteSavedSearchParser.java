package com.nova.infra.adapter.network.packets.parsers.navigator;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.navigator.NavigatorDeleteSavedSearchMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses NavigatorDeleteSavedSearch packet from client.
 */
@ParsesPacket(Incoming.NAVIGATOR_DELETE_SAVED_SEARCH)
public class NavigatorDeleteSavedSearchParser extends PacketParser<NavigatorDeleteSavedSearchMessageEvent> {
@Override
    public NavigatorDeleteSavedSearchMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new NavigatorDeleteSavedSearchMessageEvent();
    }
}
