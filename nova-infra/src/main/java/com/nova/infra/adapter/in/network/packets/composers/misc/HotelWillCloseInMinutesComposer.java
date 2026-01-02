package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.HotelWillCloseInMinutesMessage;

/**
 * Composes HotelWillCloseInMinutes packet for client.
 */
public class HotelWillCloseInMinutesComposer extends PacketComposer<HotelWillCloseInMinutesMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.HOTEL_WILL_CLOSE_MINUTES;
    }

    @Override
    protected void write(PacketBuffer packet, HotelWillCloseInMinutesMessage message) {
        packet.appendInt(message.minutes());
    }
}
