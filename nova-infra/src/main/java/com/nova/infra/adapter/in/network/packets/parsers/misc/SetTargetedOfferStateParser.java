package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.SetTargetedOfferStateMessageEvent;

/**
 * Parses SetTargetedOfferState packet from client.
 */
public class SetTargetedOfferStateParser extends PacketParser<SetTargetedOfferStateMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.SET_TARGETTED_OFFER_STATE;
    }

    @Override
    public SetTargetedOfferStateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SetTargetedOfferStateMessageEvent();
    }
}
