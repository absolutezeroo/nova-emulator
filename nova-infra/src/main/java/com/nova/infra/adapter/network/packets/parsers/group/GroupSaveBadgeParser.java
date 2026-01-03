package com.nova.infra.adapter.network.packets.parsers.group;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.group.GroupSaveBadgeMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GroupSaveBadge packet from client.
 */
@ParsesPacket(Incoming.GROUP_SAVE_BADGE)
public class GroupSaveBadgeParser extends PacketParser<GroupSaveBadgeMessageEvent> {
@Override
    public GroupSaveBadgeMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupSaveBadgeMessageEvent();
    }
}
