package com.nova.infra.adapter.in.network.packets.parsers.guide;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.guide.GuideSessionRequesterCancelsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GuideSessionRequesterCancels packet from client.
 */
@ParsesPacket(Incoming.GUIDE_SESSION_REQUESTER_CANCELS)
public class GuideSessionRequesterCancelsParser extends PacketParser<GuideSessionRequesterCancelsMessageEvent> {
@Override
    public GuideSessionRequesterCancelsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GuideSessionRequesterCancelsMessageEvent();
    }
}
