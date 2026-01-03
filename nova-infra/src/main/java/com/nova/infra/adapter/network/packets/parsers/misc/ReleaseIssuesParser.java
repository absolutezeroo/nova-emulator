package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.ReleaseIssuesMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses ReleaseIssues packet from client.
 */
@ParsesPacket(Incoming.RELEASE_ISSUES)
public class ReleaseIssuesParser extends PacketParser<ReleaseIssuesMessageEvent> {
@Override
    public ReleaseIssuesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ReleaseIssuesMessageEvent();
    }
}
