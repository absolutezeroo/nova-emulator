package com.nova.infra.adapter.network.packets.outgoing.misc;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record CampaignCalendarDataMessage(
    String campaignName,
    String campaignImage,
    int currentDay,
    int campaignDays
) implements IOutgoingPacket {}
