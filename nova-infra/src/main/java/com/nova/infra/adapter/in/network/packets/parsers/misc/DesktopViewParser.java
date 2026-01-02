package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.DesktopViewMessageEvent;

/**
 * Parses DesktopView packet from client.
 */
public class DesktopViewParser extends PacketParser<DesktopViewMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.DESKTOP_VIEW;
    }

    @Override
    public DesktopViewMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new DesktopViewMessageEvent();
    }
}
