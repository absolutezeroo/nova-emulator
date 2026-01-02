package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetThreadsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetThreads packet from client.
 */
@ParsesPacket(Incoming.GET_FORUM_THREADS)
public class GetThreadsParser extends PacketParser<GetThreadsMessageEvent> {
@Override
    public GetThreadsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetThreadsMessageEvent();
    }
}
