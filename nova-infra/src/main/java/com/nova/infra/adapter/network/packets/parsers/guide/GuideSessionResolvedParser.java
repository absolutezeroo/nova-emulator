package com.nova.infra.adapter.network.packets.parsers.guide;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.guide.GuideSessionResolvedMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GuideSessionResolved packet from client.
 */
@ParsesPacket(Incoming.GUIDE_SESSION_RESOLVED)
public class GuideSessionResolvedParser extends PacketParser<GuideSessionResolvedMessageEvent> {
@Override
    public GuideSessionResolvedMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GuideSessionResolvedMessageEvent();
    }
}
