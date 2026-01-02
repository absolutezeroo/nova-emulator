package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetHabboClubExtendOfferMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetHabboClubExtendOffer packet from client.
 */
@ParsesPacket(Incoming.GET_HABBO_CLUB_EXTEND_OFFER)
public class GetHabboClubExtendOfferParser extends PacketParser<GetHabboClubExtendOfferMessageEvent> {
@Override
    public GetHabboClubExtendOfferMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetHabboClubExtendOfferMessageEvent();
    }
}
