package com.nova.infra.adapter.network.packets.parsers.guide;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.guide.GuideSessionGuideDecidesMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
