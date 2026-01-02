package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GroupRemoveMemberMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GroupRemoveMember packet from client.
 */
@ParsesPacket(Incoming.GROUP_MEMBER_REMOVE)
public class GroupRemoveMemberParser extends PacketParser<GroupRemoveMemberMessageEvent> {
@Override
    public GroupRemoveMemberMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupRemoveMemberMessageEvent();
    }
}
