package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetSecondsUntilMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
