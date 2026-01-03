package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.ApproveNameMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses ApproveName packet from client.
 */
@ParsesPacket(Incoming.APPROVE_NAME)
public class ApproveNameParser extends PacketParser<ApproveNameMessageEvent> {
@Override
    public ApproveNameMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ApproveNameMessageEvent();
    }
}
