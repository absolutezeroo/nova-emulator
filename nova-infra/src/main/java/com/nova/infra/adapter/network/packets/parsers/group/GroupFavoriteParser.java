package com.nova.infra.adapter.network.packets.parsers.group;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.group.GroupFavoriteMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GroupFavorite packet from client.
 */
@ParsesPacket(Incoming.GROUP_FAVORITE)
public class GroupFavoriteParser extends PacketParser<GroupFavoriteMessageEvent> {
@Override
    public GroupFavoriteMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupFavoriteMessageEvent();
    }
}
