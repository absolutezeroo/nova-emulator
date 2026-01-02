package com.nova.infra.adapter.in.network.packets.parsers.guide;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.guide.GuideSessionRequesterCancelsMessageEvent;

/**
 * Parses GuideSessionRequesterCancels packet from client.
 */
public class GuideSessionRequesterCancelsParser extends PacketParser<GuideSessionRequesterCancelsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GUIDE_SESSION_REQUESTER_CANCELS;
    }

    @Override
    public GuideSessionRequesterCancelsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GuideSessionRequesterCancelsMessageEvent();
    }
}
