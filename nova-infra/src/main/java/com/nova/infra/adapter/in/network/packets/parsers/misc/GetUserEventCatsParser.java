package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetUserEventCatsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetUserEventCats packet from client.
 */
@ParsesPacket(Incoming.GET_USER_EVENT_CATS)
public class GetUserEventCatsParser extends PacketParser<GetUserEventCatsMessageEvent> {
@Override
    public GetUserEventCatsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetUserEventCatsMessageEvent();
    }
}
