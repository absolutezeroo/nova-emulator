package com.nova.infra.adapter.network.packets.parsers.group;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.group.GroupBuyDataMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GroupBuyData packet from client.
 */
@ParsesPacket(Incoming.GROUP_CREATE_OPTIONS)
public class GroupBuyDataParser extends PacketParser<GroupBuyDataMessageEvent> {
@Override
    public GroupBuyDataMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupBuyDataMessageEvent();
    }
}
