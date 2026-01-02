package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.LagWarningReportMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses LagWarningReport packet from client.
 */
@ParsesPacket(Incoming.TRACKING_LAG_WARNING_REPORT)
public class LagWarningReportParser extends PacketParser<LagWarningReportMessageEvent> {
@Override
    public LagWarningReportMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new LagWarningReportMessageEvent();
    }
}
