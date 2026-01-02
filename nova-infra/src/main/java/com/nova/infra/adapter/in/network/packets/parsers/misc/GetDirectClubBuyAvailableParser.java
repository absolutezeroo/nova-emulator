package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetDirectClubBuyAvailableMessageEvent;

/**
 * Parses GetDirectClubBuyAvailable packet from client.
 */
public class GetDirectClubBuyAvailableParser extends PacketParser<GetDirectClubBuyAvailableMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_DIRECT_CLUB_BUY_AVAILABLE;
    }

    @Override
    public GetDirectClubBuyAvailableMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetDirectClubBuyAvailableMessageEvent();
    }
}
