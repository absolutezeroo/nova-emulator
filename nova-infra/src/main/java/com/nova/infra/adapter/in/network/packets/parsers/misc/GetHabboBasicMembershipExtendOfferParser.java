package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetHabboBasicMembershipExtendOfferMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetHabboBasicMembershipExtendOffer packet from client.
 */
@ParsesPacket(Incoming.GET_HABBO_BASIC_MEMBERSHIP_EXTEND_OFFER)
public class GetHabboBasicMembershipExtendOfferParser extends PacketParser<GetHabboBasicMembershipExtendOfferMessageEvent> {
@Override
    public GetHabboBasicMembershipExtendOfferMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetHabboBasicMembershipExtendOfferMessageEvent();
    }
}
