package com.nova.infra.adapter.network.packets.parsers.navigator;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.navigator.NavigatorInitMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses NavigatorInit packet from client.
 */
@ParsesPacket(Incoming.NAVIGATOR_INIT)
public class NavigatorInitParser extends PacketParser<NavigatorInitMessageEvent> {
@Override
    public NavigatorInitMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new NavigatorInitMessageEvent();
    }
}
