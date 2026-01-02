package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.HotelClosesAndWillOpenAtMessage;

/**
 * Composes HotelClosesAndWillOpenAt packet for client.
 */
public class HotelClosesAndWillOpenAtComposer extends PacketComposer<HotelClosesAndWillOpenAtMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.HOTEL_CLOSES_AND_OPENS_AT;
    }

    @Override
    protected void write(PacketBuffer packet, HotelClosesAndWillOpenAtMessage message) {
        packet.appendInt(message.openHour());
        packet.appendInt(message.openMinute());
        packet.appendBoolean(message.userThrownOutAtClose());
    }
}
