package com.nova.infra.adapter.network.packets.parsers.group;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.group.GroupMembersMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
