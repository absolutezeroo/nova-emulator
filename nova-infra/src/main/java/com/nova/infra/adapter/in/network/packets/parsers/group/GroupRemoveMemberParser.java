package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GroupRemoveMemberMessageEvent;

/**
 * Parses GroupRemoveMember packet from client.
 */
public class GroupRemoveMemberParser extends PacketParser<GroupRemoveMemberMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GROUP_MEMBER_REMOVE;
    }

    @Override
    public GroupRemoveMemberMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupRemoveMemberMessageEvent();
    }
}
