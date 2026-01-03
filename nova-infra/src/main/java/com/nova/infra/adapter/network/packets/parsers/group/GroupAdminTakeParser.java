package com.nova.infra.adapter.network.packets.parsers.group;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.group.GroupAdminTakeMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GroupAdminTake packet from client.
 */
@ParsesPacket(Incoming.GROUP_ADMIN_REMOVE)
public class GroupAdminTakeParser extends PacketParser<GroupAdminTakeMessageEvent> {
@Override
    public GroupAdminTakeMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupAdminTakeMessageEvent();
    }
}
