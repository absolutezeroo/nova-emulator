package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetNextTargetedOfferMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetNextTargetedOffer packet from client.
 */
@ParsesPacket(Incoming.GET_NEXT_TARGETED_OFFER)
public class GetNextTargetedOfferParser extends PacketParser<GetNextTargetedOfferMessageEvent> {
@Override
    public GetNextTargetedOfferMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetNextTargetedOfferMessageEvent();
    }
}
