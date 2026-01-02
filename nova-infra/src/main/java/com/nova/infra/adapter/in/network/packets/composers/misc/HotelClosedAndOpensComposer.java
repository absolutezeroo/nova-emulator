package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.HotelClosedAndOpensMessage;

/**
 * Composes HotelClosedAndOpens packet for client.
 */
public class HotelClosedAndOpensComposer extends PacketComposer<HotelClosedAndOpensMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.HOTEL_CLOSED_AND_OPENS;
    }

    @Override
    protected void write(PacketBuffer packet, HotelClosedAndOpensMessage message) {
        packet.appendInt(message.openHour());
        packet.appendInt(message.openMinute());
    }
}
