package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetForumStatsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetForumStats packet from client.
 */
@ParsesPacket(Incoming.GET_FORUM_STATS)
public class GetForumStatsParser extends PacketParser<GetForumStatsMessageEvent> {
@Override
    public GetForumStatsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetForumStatsMessageEvent();
    }
}
