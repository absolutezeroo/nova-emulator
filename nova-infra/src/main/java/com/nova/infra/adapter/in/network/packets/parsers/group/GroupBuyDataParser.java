package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GroupBuyDataMessageEvent;

/**
 * Parses GroupBuyData packet from client.
 */
public class GroupBuyDataParser extends PacketParser<GroupBuyDataMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GROUP_CREATE_OPTIONS;
    }

    @Override
    public GroupBuyDataMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupBuyDataMessageEvent();
    }
}
