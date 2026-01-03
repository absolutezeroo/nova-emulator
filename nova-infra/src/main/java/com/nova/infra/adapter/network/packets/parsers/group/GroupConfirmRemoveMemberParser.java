package com.nova.infra.adapter.network.packets.parsers.group;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.group.GroupConfirmRemoveMemberMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GroupConfirmRemoveMember packet from client.
 */
@ParsesPacket(Incoming.GROUP_MEMBER_REMOVE_CONFIRM)
public class GroupConfirmRemoveMemberParser extends PacketParser<GroupConfirmRemoveMemberMessageEvent> {
@Override
    public GroupConfirmRemoveMemberMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupConfirmRemoveMemberMessageEvent();
    }
}
