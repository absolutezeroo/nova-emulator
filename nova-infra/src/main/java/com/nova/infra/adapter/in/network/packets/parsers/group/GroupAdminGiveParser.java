package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GroupAdminGiveMessageEvent;

/**
 * Parses GroupAdminGive packet from client.
 */
public class GroupAdminGiveParser extends PacketParser<GroupAdminGiveMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GROUP_ADMIN_ADD;
    }

    @Override
    public GroupAdminGiveMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupAdminGiveMessageEvent();
    }
}
