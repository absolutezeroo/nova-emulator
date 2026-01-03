package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.CloseIssueDefaultActionMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses CloseIssueDefaultAction packet from client.
 */
@ParsesPacket(Incoming.CLOSE_ISSUE_DEFAULT_ACTION)
public class CloseIssueDefaultActionParser extends PacketParser<CloseIssueDefaultActionMessageEvent> {
@Override
    public CloseIssueDefaultActionMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CloseIssueDefaultActionMessageEvent();
    }
}
