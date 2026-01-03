package com.nova.infra.adapter.network.packets.parsers.group;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.group.GroupDeleteMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
