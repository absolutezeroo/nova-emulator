package com.nova.infra.adapter.network.packets.parsers.guide;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.guide.GuideSessionReportMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GuideSessionReport packet from client.
 */
@ParsesPacket(Incoming.GUIDE_SESSION_REPORT)
public class GuideSessionReportParser extends PacketParser<GuideSessionReportMessageEvent> {
@Override
    public GuideSessionReportMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GuideSessionReportMessageEvent();
    }
}
