package com.nova.infra.adapter.network.packets.parsers.group;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.group.GroupUnfavoriteMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GroupUnfavorite packet from client.
 */
@ParsesPacket(Incoming.GROUP_UNFAVORITE)
public class GroupUnfavoriteParser extends PacketParser<GroupUnfavoriteMessageEvent> {
@Override
    public GroupUnfavoriteMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupUnfavoriteMessageEvent();
    }
}
