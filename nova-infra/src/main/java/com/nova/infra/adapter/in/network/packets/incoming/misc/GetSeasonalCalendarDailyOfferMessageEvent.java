package com.nova.infra.adapter.in.network.packets.incoming.misc;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record GetSeasonalCalendarDailyOfferMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
