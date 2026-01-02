package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetTargetedOfferMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetTargetedOffer packet from client.
 */
@ParsesPacket(Incoming.GET_TARGETED_OFFER)
public class GetTargetedOfferParser extends PacketParser<GetTargetedOfferMessageEvent> {
@Override
    public GetTargetedOfferMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetTargetedOfferMessageEvent();
    }
}
