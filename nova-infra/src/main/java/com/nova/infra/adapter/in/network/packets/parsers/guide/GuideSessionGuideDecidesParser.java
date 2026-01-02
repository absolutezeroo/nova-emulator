package com.nova.infra.adapter.in.network.packets.parsers.guide;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.guide.GuideSessionGuideDecidesMessageEvent;

/**
 * Parses GuideSessionGuideDecides packet from client.
 */
public class GuideSessionGuideDecidesParser extends PacketParser<GuideSessionGuideDecidesMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GUIDE_SESSION_GUIDE_DECIDES;
    }

    @Override
    public GuideSessionGuideDecidesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GuideSessionGuideDecidesMessageEvent();
    }
}
