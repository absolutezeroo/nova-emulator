package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GroupFavoriteMessageEvent;

/**
 * Parses GroupFavorite packet from client.
 */
public class GroupFavoriteParser extends PacketParser<GroupFavoriteMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GROUP_FAVORITE;
    }

    @Override
    public GroupFavoriteMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupFavoriteMessageEvent();
    }
}
