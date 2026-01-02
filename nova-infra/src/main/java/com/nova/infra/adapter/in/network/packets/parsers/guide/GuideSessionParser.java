package com.nova.infra.adapter.in.network.packets.parsers.guide;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.guide.GuideSessionMessageEvent;

/**
 * Parses GuideSession packet from client.
 */
public class GuideSessionParser extends PacketParser<GuideSessionMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GUIDE_SESSION_MESSAGE;
    }

    @Override
    public GuideSessionMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GuideSessionMessageEvent();
    }
}
