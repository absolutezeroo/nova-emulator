package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GroupMembersMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GroupMembers packet from client.
 */
@ParsesPacket(Incoming.GROUP_MEMBERS)
public class GroupMembersParser extends PacketParser<GroupMembersMessageEvent> {
@Override
    public GroupMembersMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupMembersMessageEvent();
    }
}
