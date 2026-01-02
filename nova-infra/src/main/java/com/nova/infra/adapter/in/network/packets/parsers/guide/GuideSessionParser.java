package com.nova.infra.adapter.in.network.packets.parsers.guide;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.guide.GuideSessionMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GuideSession packet from client.
 */
@ParsesPacket(Incoming.GUIDE_SESSION_MESSAGE)
public class GuideSessionParser extends PacketParser<GuideSessionMessageEvent> {
@Override
    public GuideSessionMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GuideSessionMessageEvent();
    }
}
