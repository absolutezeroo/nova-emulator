package com.nova.infra.adapter.network.packets.parsers.group;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.group.GroupBuyMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GroupBuy packet from client.
 */
@ParsesPacket(Incoming.GROUP_BUY)
public class GroupBuyParser extends PacketParser<GroupBuyMessageEvent> {
@Override
    public GroupBuyMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupBuyMessageEvent();
    }
}
