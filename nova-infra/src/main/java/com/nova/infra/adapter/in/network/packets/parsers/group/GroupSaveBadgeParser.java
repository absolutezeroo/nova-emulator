package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GroupSaveBadgeMessageEvent;

/**
 * Parses GroupSaveBadge packet from client.
 */
public class GroupSaveBadgeParser extends PacketParser<GroupSaveBadgeMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GROUP_SAVE_BADGE;
    }

    @Override
    public GroupSaveBadgeMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupSaveBadgeMessageEvent();
    }
}
