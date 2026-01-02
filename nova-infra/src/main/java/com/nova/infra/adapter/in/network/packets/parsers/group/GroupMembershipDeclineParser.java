package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GroupMembershipDeclineMessageEvent;

/**
 * Parses GroupMembershipDecline packet from client.
 */
public class GroupMembershipDeclineParser extends PacketParser<GroupMembershipDeclineMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GROUP_REQUEST_DECLINE;
    }

    @Override
    public GroupMembershipDeclineMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupMembershipDeclineMessageEvent();
    }
}
