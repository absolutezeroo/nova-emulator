package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetIsBadgeRequestFulfilledMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetIsBadgeRequestFulfilled packet from client.
 */
@ParsesPacket(Incoming.GETISBADGEREQUESTFULFILLED)
public class GetIsBadgeRequestFulfilledParser extends PacketParser<GetIsBadgeRequestFulfilledMessageEvent> {
@Override
    public GetIsBadgeRequestFulfilledMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetIsBadgeRequestFulfilledMessageEvent();
    }
}
