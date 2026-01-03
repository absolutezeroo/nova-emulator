package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.HotelClosesAndWillOpenAtMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes HotelClosesAndWillOpenAt packet for client.
 */
@ComposesPacket(Outgoing.HOTEL_CLOSES_AND_OPENS_AT)
public class HotelClosesAndWillOpenAtComposer extends PacketComposer<HotelClosesAndWillOpenAtMessage> {
@Override
    protected void write(PacketBuffer packet, HotelClosesAndWillOpenAtMessage message) {
        packet.appendInt(message.openHour());
        packet.appendInt(message.openMinute());
        packet.appendBoolean(message.userThrownOutAtClose());
    }
}
