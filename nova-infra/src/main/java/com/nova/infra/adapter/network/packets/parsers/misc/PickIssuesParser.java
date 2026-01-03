package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.PickIssuesMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses PickIssues packet from client.
 */
@ParsesPacket(Incoming.PICK_ISSUES)
public class PickIssuesParser extends PacketParser<PickIssuesMessageEvent> {
@Override
    public PickIssuesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PickIssuesMessageEvent();
    }
}
