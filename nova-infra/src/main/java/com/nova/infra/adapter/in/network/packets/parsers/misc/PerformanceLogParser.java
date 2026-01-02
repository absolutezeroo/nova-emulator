package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.PerformanceLogMessageEvent;

/**
 * Parses PerformanceLog packet from client.
 */
public class PerformanceLogParser extends PacketParser<PerformanceLogMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.TRACKING_PERFORMANCE_LOG;
    }

    @Override
    public PerformanceLogMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PerformanceLogMessageEvent();
    }
}
