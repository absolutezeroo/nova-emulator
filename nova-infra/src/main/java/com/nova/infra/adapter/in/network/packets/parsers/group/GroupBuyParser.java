package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GroupBuyMessageEvent;

/**
 * Parses GroupBuy packet from client.
 */
public class GroupBuyParser extends PacketParser<GroupBuyMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GROUP_BUY;
    }

    @Override
    public GroupBuyMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupBuyMessageEvent();
    }
}
