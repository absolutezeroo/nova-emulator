package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetLimitedOfferAppearingNextMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetLimitedOfferAppearingNext packet from client.
 */
@ParsesPacket(Incoming.GET_LIMITED_OFFER_APPEARING_NEXT)
public class GetLimitedOfferAppearingNextParser extends PacketParser<GetLimitedOfferAppearingNextMessageEvent> {
@Override
    public GetLimitedOfferAppearingNextMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetLimitedOfferAppearingNextMessageEvent();
    }
}
