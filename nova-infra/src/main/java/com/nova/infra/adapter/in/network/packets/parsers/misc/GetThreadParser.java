package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetThreadMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetThread packet from client.
 */
@ParsesPacket(Incoming.GET_FORUM_THREAD)
public class GetThreadParser extends PacketParser<GetThreadMessageEvent> {
@Override
    public GetThreadMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetThreadMessageEvent();
    }
}
