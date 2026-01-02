package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.HotelWillCloseInMinutesMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes HotelWillCloseInMinutes packet for client.
 */
@ComposesPacket(Outgoing.HOTEL_WILL_CLOSE_MINUTES)
public class HotelWillCloseInMinutesComposer extends PacketComposer<HotelWillCloseInMinutesMessage> {
@Override
    protected void write(PacketBuffer packet, HotelWillCloseInMinutesMessage message) {
        packet.appendInt(message.minutes());
    }
}
