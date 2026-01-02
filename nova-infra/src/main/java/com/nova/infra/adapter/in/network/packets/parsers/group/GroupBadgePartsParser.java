package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GroupBadgePartsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GroupBadgeParts packet from client.
 */
@ParsesPacket(Incoming.GROUP_PARTS)
public class GroupBadgePartsParser extends PacketParser<GroupBadgePartsMessageEvent> {
@Override
    public GroupBadgePartsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupBadgePartsMessageEvent();
    }
}
