package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetMessagesMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetMessages packet from client.
 */
@ParsesPacket(Incoming.GET_FORUM_MESSAGES)
public class GetMessagesParser extends PacketParser<GetMessagesMessageEvent> {
@Override
    public GetMessagesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetMessagesMessageEvent();
    }
}
