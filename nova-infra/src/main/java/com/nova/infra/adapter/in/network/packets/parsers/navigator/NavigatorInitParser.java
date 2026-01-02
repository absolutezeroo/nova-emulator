package com.nova.infra.adapter.in.network.packets.parsers.navigator;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.navigator.NavigatorInitMessageEvent;

/**
 * Parses NavigatorInit packet from client.
 */
public class NavigatorInitParser extends PacketParser<NavigatorInitMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.NAVIGATOR_INIT;
    }

    @Override
    public NavigatorInitMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new NavigatorInitMessageEvent();
    }
}
