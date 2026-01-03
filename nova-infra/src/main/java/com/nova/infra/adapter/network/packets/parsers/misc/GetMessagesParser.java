package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetMessagesMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
