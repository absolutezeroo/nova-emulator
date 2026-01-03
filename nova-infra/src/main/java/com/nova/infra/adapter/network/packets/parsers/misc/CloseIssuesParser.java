package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.CloseIssuesMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses CloseIssues packet from client.
 */
@ParsesPacket(Incoming.CLOSE_ISSUES)
public class CloseIssuesParser extends PacketParser<CloseIssuesMessageEvent> {
@Override
    public CloseIssuesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CloseIssuesMessageEvent();
    }
}
