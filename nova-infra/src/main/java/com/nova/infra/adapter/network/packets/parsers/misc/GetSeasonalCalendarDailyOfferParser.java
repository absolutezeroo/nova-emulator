package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetSeasonalCalendarDailyOfferMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetSeasonalCalendarDailyOffer packet from client.
 */
@ParsesPacket(Incoming.GET_SEASONAL_CALENDAR_DAILY_OFFER)
public class GetSeasonalCalendarDailyOfferParser extends PacketParser<GetSeasonalCalendarDailyOfferMessageEvent> {
@Override
    public GetSeasonalCalendarDailyOfferMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetSeasonalCalendarDailyOfferMessageEvent();
    }
}
