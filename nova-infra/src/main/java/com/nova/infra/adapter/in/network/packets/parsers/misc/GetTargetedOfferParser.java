package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetTargetedOfferMessageEvent;

/**
 * Parses GetTargetedOffer packet from client.
 */
public class GetTargetedOfferParser extends PacketParser<GetTargetedOfferMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_TARGETED_OFFER;
    }

    @Override
    public GetTargetedOfferMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetTargetedOfferMessageEvent();
    }
}
