package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GroupJoinMessageEvent;

/**
 * Parses GroupJoin packet from client.
 */
public class GroupJoinParser extends PacketParser<GroupJoinMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GROUP_REQUEST;
    }

    @Override
    public GroupJoinMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupJoinMessageEvent();
    }
}
