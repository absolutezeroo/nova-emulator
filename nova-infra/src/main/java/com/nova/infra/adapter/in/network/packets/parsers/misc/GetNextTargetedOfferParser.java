package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetNextTargetedOfferMessageEvent;

/**
 * Parses GetNextTargetedOffer packet from client.
 */
public class GetNextTargetedOfferParser extends PacketParser<GetNextTargetedOfferMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_NEXT_TARGETED_OFFER;
    }

    @Override
    public GetNextTargetedOfferMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetNextTargetedOfferMessageEvent();
    }
}
