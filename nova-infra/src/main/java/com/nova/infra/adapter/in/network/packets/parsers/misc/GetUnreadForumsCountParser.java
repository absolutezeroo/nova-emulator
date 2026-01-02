package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetUnreadForumsCountMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetUnreadForumsCount packet from client.
 */
@ParsesPacket(Incoming.GET_UNREAD_FORUMS_COUNT)
public class GetUnreadForumsCountParser extends PacketParser<GetUnreadForumsCountMessageEvent> {
@Override
    public GetUnreadForumsCountMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetUnreadForumsCountMessageEvent();
    }
}
