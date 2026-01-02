package com.nova.infra.adapter.in.network.packets.parsers.guide;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.guide.GuideSessionCreateMessageEvent;

/**
 * Parses GuideSessionCreate packet from client.
 */
public class GuideSessionCreateParser extends PacketParser<GuideSessionCreateMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GUIDE_SESSION_CREATE;
    }

    @Override
    public GuideSessionCreateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GuideSessionCreateMessageEvent();
    }
}
