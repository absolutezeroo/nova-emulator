package com.nova.infra.adapter.in.network.packets.parsers.moderation;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.moderation.GetUserChatlogMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetUserChatlog packet from client.
 */
@ParsesPacket(Incoming.MODTOOL_REQUEST_USER_CHATLOG)
public class GetUserChatlogParser extends PacketParser<GetUserChatlogMessageEvent> {
@Override
    public GetUserChatlogMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetUserChatlogMessageEvent();
    }
}
