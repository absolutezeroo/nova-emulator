package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetClubOffersMessageEvent;

/**
 * Parses GetClubOffers packet from client.
 */
public class GetClubOffersParser extends PacketParser<GetClubOffersMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_CLUB_OFFERS;
    }

    @Override
    public GetClubOffersMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetClubOffersMessageEvent();
    }
}
