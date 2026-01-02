package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetForumStatsMessageEvent;

/**
 * Parses GetForumStats packet from client.
 */
public class GetForumStatsParser extends PacketParser<GetForumStatsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_FORUM_STATS;
    }

    @Override
    public GetForumStatsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetForumStatsMessageEvent();
    }
}
