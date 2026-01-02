package com.nova.infra.adapter.in.network.packets.parsers.guide;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.guide.GuideSessionGuideDecidesMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GuideSessionGuideDecides packet from client.
 */
@ParsesPacket(Incoming.GUIDE_SESSION_GUIDE_DECIDES)
public class GuideSessionGuideDecidesParser extends PacketParser<GuideSessionGuideDecidesMessageEvent> {
@Override
    public GuideSessionGuideDecidesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GuideSessionGuideDecidesMessageEvent();
    }
}
