package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetHabboClubExtendOfferMessageEvent;

/**
 * Parses GetHabboClubExtendOffer packet from client.
 */
public class GetHabboClubExtendOfferParser extends PacketParser<GetHabboClubExtendOfferMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_HABBO_CLUB_EXTEND_OFFER;
    }

    @Override
    public GetHabboClubExtendOfferMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetHabboClubExtendOfferMessageEvent();
    }
}
