package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.PerformanceLogMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses PerformanceLog packet from client.
 */
@ParsesPacket(Incoming.TRACKING_PERFORMANCE_LOG)
public class PerformanceLogParser extends PacketParser<PerformanceLogMessageEvent> {
@Override
    public PerformanceLogMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PerformanceLogMessageEvent();
    }
}
