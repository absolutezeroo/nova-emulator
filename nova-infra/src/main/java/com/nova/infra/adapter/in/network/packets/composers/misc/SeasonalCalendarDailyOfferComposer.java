package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.SeasonalCalendarDailyOfferMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes SeasonalCalendarDailyOffer packet for client.
 */
@ComposesPacket(Outgoing.SEASONAL_CALENDAR_OFFER)
public class SeasonalCalendarDailyOfferComposer extends PacketComposer<SeasonalCalendarDailyOfferMessage> {
@Override
    protected void write(PacketBuffer packet, SeasonalCalendarDailyOfferMessage message) {
        packet.appendInt(message.pageId());
    }
}
