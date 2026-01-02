package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetThreadMessageEvent;

/**
 * Parses GetThread packet from client.
 */
public class GetThreadParser extends PacketParser<GetThreadMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_FORUM_THREAD;
    }

    @Override
    public GetThreadMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetThreadMessageEvent();
    }
}
