package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GroupMembershipAcceptMessageEvent;

/**
 * Parses GroupMembershipAccept packet from client.
 */
public class GroupMembershipAcceptParser extends PacketParser<GroupMembershipAcceptMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GROUP_REQUEST_ACCEPT;
    }

    @Override
    public GroupMembershipAcceptMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupMembershipAcceptMessageEvent();
    }
}
