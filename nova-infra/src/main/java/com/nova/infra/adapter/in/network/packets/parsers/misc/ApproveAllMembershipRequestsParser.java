package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ApproveAllMembershipRequestsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses ApproveAllMembershipRequests packet from client.
 */
@ParsesPacket(Incoming.APPROVE_ALL_MEMBERSHIP_REQUESTS)
public class ApproveAllMembershipRequestsParser extends PacketParser<ApproveAllMembershipRequestsMessageEvent> {
@Override
    public ApproveAllMembershipRequestsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ApproveAllMembershipRequestsMessageEvent();
    }
}
