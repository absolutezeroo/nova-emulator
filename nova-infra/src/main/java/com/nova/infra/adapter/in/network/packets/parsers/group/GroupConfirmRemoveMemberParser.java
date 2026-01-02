package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GroupConfirmRemoveMemberMessageEvent;

/**
 * Parses GroupConfirmRemoveMember packet from client.
 */
public class GroupConfirmRemoveMemberParser extends PacketParser<GroupConfirmRemoveMemberMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GROUP_MEMBER_REMOVE_CONFIRM;
    }

    @Override
    public GroupConfirmRemoveMemberMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupConfirmRemoveMemberMessageEvent();
    }
}
