package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.CampaignCalendarDoorOpenedMessage;

/**
 * Composes CampaignCalendarDoorOpened packet for client.
 */
public class CampaignCalendarDoorOpenedComposer extends PacketComposer<CampaignCalendarDoorOpenedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CAMPAIGN_CALENDAR_DOOR_OPENED;
    }

    @Override
    protected void write(PacketBuffer packet, CampaignCalendarDoorOpenedMessage message) {
        packet.appendBoolean(message.doorOpened());
        packet.appendString(message.productName());
        packet.appendString(message.customImage());
        packet.appendString(message.furnitureClassName());
    }
}
