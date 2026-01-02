package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetForumsListMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
