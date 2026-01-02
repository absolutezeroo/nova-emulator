package com.nova.infra.adapter.in.network.packets.parsers.navigator;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.navigator.NavigatorSearchCloseMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses NavigatorSearchClose packet from client.
 */
@ParsesPacket(Incoming.NAVIGATOR_SEARCH_CLOSE)
public class NavigatorSearchCloseParser extends PacketParser<NavigatorSearchCloseMessageEvent> {
@Override
    public NavigatorSearchCloseMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new NavigatorSearchCloseMessageEvent();
    }
}
