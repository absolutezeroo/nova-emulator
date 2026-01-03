package com.nova.infra.adapter.network.packets.parsers.guide;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.guide.GuideSessionCreateMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GuideSessionCreate packet from client.
 */
@ParsesPacket(Incoming.GUIDE_SESSION_CREATE)
public class GuideSessionCreateParser extends PacketParser<GuideSessionCreateMessageEvent> {
@Override
    public GuideSessionCreateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GuideSessionCreateMessageEvent();
    }
}
