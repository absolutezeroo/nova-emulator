package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetSeasonalCalendarDailyOfferMessageEvent;

/**
 * Parses GetSeasonalCalendarDailyOffer packet from client.
 */
public class GetSeasonalCalendarDailyOfferParser extends PacketParser<GetSeasonalCalendarDailyOfferMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_SEASONAL_CALENDAR_DAILY_OFFER;
    }

    @Override
    public GetSeasonalCalendarDailyOfferMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetSeasonalCalendarDailyOfferMessageEvent();
    }
}
