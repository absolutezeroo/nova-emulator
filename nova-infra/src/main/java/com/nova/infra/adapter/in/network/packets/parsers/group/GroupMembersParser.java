package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GroupMembersMessageEvent;

/**
 * Parses GroupMembers packet from client.
 */
public class GroupMembersParser extends PacketParser<GroupMembersMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GROUP_MEMBERS;
    }

    @Override
    public GroupMembersMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupMembersMessageEvent();
    }
}
