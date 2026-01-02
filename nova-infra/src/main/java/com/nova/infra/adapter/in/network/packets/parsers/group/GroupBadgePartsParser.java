package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GroupBadgePartsMessageEvent;

/**
 * Parses GroupBadgeParts packet from client.
 */
public class GroupBadgePartsParser extends PacketParser<GroupBadgePartsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GROUP_PARTS;
    }

    @Override
    public GroupBadgePartsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupBadgePartsMessageEvent();
    }
}
