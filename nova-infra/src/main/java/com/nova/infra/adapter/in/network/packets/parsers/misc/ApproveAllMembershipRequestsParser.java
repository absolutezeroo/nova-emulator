package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ApproveAllMembershipRequestsMessageEvent;

/**
 * Parses ApproveAllMembershipRequests packet from client.
 */
public class ApproveAllMembershipRequestsParser extends PacketParser<ApproveAllMembershipRequestsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.APPROVE_ALL_MEMBERSHIP_REQUESTS;
    }

    @Override
    public ApproveAllMembershipRequestsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ApproveAllMembershipRequestsMessageEvent();
    }
}
