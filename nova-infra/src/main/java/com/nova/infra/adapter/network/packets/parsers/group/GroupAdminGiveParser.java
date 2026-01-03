package com.nova.infra.adapter.network.packets.parsers.group;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.group.GroupAdminGiveMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GroupAdminGive packet from client.
 */
@ParsesPacket(Incoming.GROUP_ADMIN_ADD)
public class GroupAdminGiveParser extends PacketParser<GroupAdminGiveMessageEvent> {
@Override
    public GroupAdminGiveMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupAdminGiveMessageEvent();
    }
}
