package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GroupMembershipAcceptMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GroupMembershipAccept packet from client.
 */
@ParsesPacket(Incoming.GROUP_REQUEST_ACCEPT)
public class GroupMembershipAcceptParser extends PacketParser<GroupMembershipAcceptMessageEvent> {
@Override
    public GroupMembershipAcceptMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupMembershipAcceptMessageEvent();
    }
}
