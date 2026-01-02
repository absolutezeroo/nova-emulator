package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GroupAdminTakeMessageEvent;

/**
 * Parses GroupAdminTake packet from client.
 */
public class GroupAdminTakeParser extends PacketParser<GroupAdminTakeMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GROUP_ADMIN_REMOVE;
    }

    @Override
    public GroupAdminTakeMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupAdminTakeMessageEvent();
    }
}
