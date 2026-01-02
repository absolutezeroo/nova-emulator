package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetSecondsUntilMessageEvent;

/**
 * Parses GetSecondsUntil packet from client.
 */
public class GetSecondsUntilParser extends PacketParser<GetSecondsUntilMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_SECONDS_UNTIL;
    }

    @Override
    public GetSecondsUntilMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetSecondsUntilMessageEvent();
    }
}
