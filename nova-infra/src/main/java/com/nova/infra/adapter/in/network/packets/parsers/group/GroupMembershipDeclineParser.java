package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GroupMembershipDeclineMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GroupMembershipDecline packet from client.
 */
@ParsesPacket(Incoming.GROUP_REQUEST_DECLINE)
public class GroupMembershipDeclineParser extends PacketParser<GroupMembershipDeclineMessageEvent> {
@Override
    public GroupMembershipDeclineMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupMembershipDeclineMessageEvent();
    }
}
