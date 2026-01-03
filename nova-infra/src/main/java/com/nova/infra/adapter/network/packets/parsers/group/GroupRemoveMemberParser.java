package com.nova.infra.adapter.network.packets.parsers.group;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.group.GroupRemoveMemberMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
