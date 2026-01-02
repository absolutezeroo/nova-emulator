package com.nova.infra.adapter.in.network.packets.parsers.navigator;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.navigator.NavigatorSearchSaveMessageEvent;

/**
 * Parses NavigatorSearchSave packet from client.
 */
public class NavigatorSearchSaveParser extends PacketParser<NavigatorSearchSaveMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.NAVIGATOR_SEARCH_SAVE;
    }

    @Override
    public NavigatorSearchSaveMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new NavigatorSearchSaveMessageEvent();
    }
}
