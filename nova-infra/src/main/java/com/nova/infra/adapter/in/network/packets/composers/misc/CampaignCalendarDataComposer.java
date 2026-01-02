package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.CampaignCalendarDataMessage;

/**
 * Composes CampaignCalendarData packet for client.
 */
public class CampaignCalendarDataComposer extends PacketComposer<CampaignCalendarDataMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CAMPAIGN_CALENDAR_DATA;
    }

    @Override
    protected void write(PacketBuffer packet, CampaignCalendarDataMessage message) {
        packet.appendString(message.campaignName());
        packet.appendString(message.campaignImage());
        packet.appendInt(message.currentDay());
        packet.appendInt(message.campaignDays());
    }
}
