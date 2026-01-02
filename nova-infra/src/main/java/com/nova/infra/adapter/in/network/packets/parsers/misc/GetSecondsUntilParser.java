package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetSecondsUntilMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetSecondsUntil packet from client.
 */
@ParsesPacket(Incoming.GET_SECONDS_UNTIL)
public class GetSecondsUntilParser extends PacketParser<GetSecondsUntilMessageEvent> {
@Override
    public GetSecondsUntilMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetSecondsUntilMessageEvent();
    }
}
