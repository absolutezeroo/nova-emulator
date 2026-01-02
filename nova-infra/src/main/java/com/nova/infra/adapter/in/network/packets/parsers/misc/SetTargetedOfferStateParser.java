package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.SetTargetedOfferStateMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses SetTargetedOfferState packet from client.
 */
@ParsesPacket(Incoming.SET_TARGETTED_OFFER_STATE)
public class SetTargetedOfferStateParser extends PacketParser<SetTargetedOfferStateMessageEvent> {
@Override
    public SetTargetedOfferStateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SetTargetedOfferStateMessageEvent();
    }
}
