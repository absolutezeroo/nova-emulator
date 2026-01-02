package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GroupDeleteMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GroupDelete packet from client.
 */
@ParsesPacket(Incoming.GROUP_DELETE)
public class GroupDeleteParser extends PacketParser<GroupDeleteMessageEvent> {
@Override
    public GroupDeleteMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupDeleteMessageEvent();
    }
}
