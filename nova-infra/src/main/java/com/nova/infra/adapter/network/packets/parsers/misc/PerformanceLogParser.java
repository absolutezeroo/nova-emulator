package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.PerformanceLogMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
