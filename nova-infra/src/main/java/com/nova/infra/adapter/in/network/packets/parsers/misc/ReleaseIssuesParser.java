package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ReleaseIssuesMessageEvent;

/**
 * Parses ReleaseIssues packet from client.
 */
public class ReleaseIssuesParser extends PacketParser<ReleaseIssuesMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.RELEASE_ISSUES;
    }

    @Override
    public ReleaseIssuesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ReleaseIssuesMessageEvent();
    }
}
