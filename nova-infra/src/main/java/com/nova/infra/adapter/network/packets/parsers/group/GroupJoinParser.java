package com.nova.infra.adapter.network.packets.parsers.group;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.group.GroupJoinMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GroupJoin packet from client.
 */
@ParsesPacket(Incoming.GROUP_REQUEST)
public class GroupJoinParser extends PacketParser<GroupJoinMessageEvent> {
@Override
    public GroupJoinMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupJoinMessageEvent();
    }
}
