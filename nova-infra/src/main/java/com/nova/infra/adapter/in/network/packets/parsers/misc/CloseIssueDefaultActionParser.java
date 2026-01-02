package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.CloseIssueDefaultActionMessageEvent;

/**
 * Parses CloseIssueDefaultAction packet from client.
 */
public class CloseIssueDefaultActionParser extends PacketParser<CloseIssueDefaultActionMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.CLOSE_ISSUE_DEFAULT_ACTION;
    }

    @Override
    public CloseIssueDefaultActionMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CloseIssueDefaultActionMessageEvent();
    }
}
