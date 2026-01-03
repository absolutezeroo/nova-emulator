package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.ApproveAllMembershipRequestsMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
