package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetForumsListMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetForumsList packet from client.
 */
@ParsesPacket(Incoming.GET_FORUMS_LIST)
public class GetForumsListParser extends PacketParser<GetForumsListMessageEvent> {
@Override
    public GetForumsListMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetForumsListMessageEvent();
    }
}
