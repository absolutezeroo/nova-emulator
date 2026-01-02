package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetIsBadgeRequestFulfilledMessageEvent;

/**
 * Parses GetIsBadgeRequestFulfilled packet from client.
 */
public class GetIsBadgeRequestFulfilledParser extends PacketParser<GetIsBadgeRequestFulfilledMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GETISBADGEREQUESTFULFILLED;
    }

    @Override
    public GetIsBadgeRequestFulfilledMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetIsBadgeRequestFulfilledMessageEvent();
    }
}
