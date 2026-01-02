package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.HotelClosedAndOpensMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes HotelClosedAndOpens packet for client.
 */
@ComposesPacket(Outgoing.HOTEL_CLOSED_AND_OPENS)
public class HotelClosedAndOpensComposer extends PacketComposer<HotelClosedAndOpensMessage> {
@Override
    protected void write(PacketBuffer packet, HotelClosedAndOpensMessage message) {
        packet.appendInt(message.openHour());
        packet.appendInt(message.openMinute());
    }
}
