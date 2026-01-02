package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GroupSaveBadgeMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
