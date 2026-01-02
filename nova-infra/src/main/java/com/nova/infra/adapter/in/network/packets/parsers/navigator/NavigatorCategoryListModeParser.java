package com.nova.infra.adapter.in.network.packets.parsers.navigator;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.navigator.NavigatorCategoryListModeMessageEvent;

/**
 * Parses NavigatorCategoryListMode packet from client.
 */
public class NavigatorCategoryListModeParser extends PacketParser<NavigatorCategoryListModeMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.NAVIGATOR_CATEGORY_LIST_MODE;
    }

    @Override
    public NavigatorCategoryListModeMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new NavigatorCategoryListModeMessageEvent();
    }
}
