package com.nova.infra.adapter.network.packets.parsers.navigator;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.navigator.NavigatorCategoryListModeMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses NavigatorCategoryListMode packet from client.
 */
@ParsesPacket(Incoming.NAVIGATOR_CATEGORY_LIST_MODE)
public class NavigatorCategoryListModeParser extends PacketParser<NavigatorCategoryListModeMessageEvent> {
@Override
    public NavigatorCategoryListModeMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new NavigatorCategoryListModeMessageEvent();
    }
}
