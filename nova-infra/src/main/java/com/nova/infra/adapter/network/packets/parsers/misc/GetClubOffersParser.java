package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetClubOffersMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetClubOffers packet from client.
 */
@ParsesPacket(Incoming.GET_CLUB_OFFERS)
public class GetClubOffersParser extends PacketParser<GetClubOffersMessageEvent> {
@Override
    public GetClubOffersMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetClubOffersMessageEvent();
    }
}
