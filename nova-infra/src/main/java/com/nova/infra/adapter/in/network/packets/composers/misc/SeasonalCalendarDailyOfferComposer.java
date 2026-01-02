package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.SeasonalCalendarDailyOfferMessage;

/**
 * Composes SeasonalCalendarDailyOffer packet for client.
 */
public class SeasonalCalendarDailyOfferComposer extends PacketComposer<SeasonalCalendarDailyOfferMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.SEASONAL_CALENDAR_OFFER;
    }

    @Override
    protected void write(PacketBuffer packet, SeasonalCalendarDailyOfferMessage message) {
        packet.appendInt(message.pageId());
    }
}
