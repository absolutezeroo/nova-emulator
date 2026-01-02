package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.CampaignCalendarDataMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes CampaignCalendarData packet for client.
 */
@ComposesPacket(Outgoing.CAMPAIGN_CALENDAR_DATA)
public class CampaignCalendarDataComposer extends PacketComposer<CampaignCalendarDataMessage> {
@Override
    protected void write(PacketBuffer packet, CampaignCalendarDataMessage message) {
        packet.appendString(message.campaignName());
        packet.appendString(message.campaignImage());
        packet.appendInt(message.currentDay());
        packet.appendInt(message.campaignDays());
    }
}
