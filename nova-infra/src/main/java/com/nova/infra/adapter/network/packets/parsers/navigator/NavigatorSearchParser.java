package com.nova.infra.adapter.network.packets.parsers.navigator;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.navigator.NavigatorSearchMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses NavigatorSearch packet from client.
 */
@ParsesPacket(Incoming.NAVIGATOR_SEARCH)
public class NavigatorSearchParser extends PacketParser<NavigatorSearchMessageEvent> {
@Override
    public NavigatorSearchMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new NavigatorSearchMessageEvent();
    }
}
