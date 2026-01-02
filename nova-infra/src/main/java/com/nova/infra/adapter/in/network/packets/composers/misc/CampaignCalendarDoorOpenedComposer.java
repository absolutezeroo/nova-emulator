package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.CampaignCalendarDoorOpenedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes CampaignCalendarDoorOpened packet for client.
 */
@ComposesPacket(Outgoing.CAMPAIGN_CALENDAR_DOOR_OPENED)
public class CampaignCalendarDoorOpenedComposer extends PacketComposer<CampaignCalendarDoorOpenedMessage> {
@Override
    protected void write(PacketBuffer packet, CampaignCalendarDoorOpenedMessage message) {
        packet.appendBoolean(message.doorOpened());
        packet.appendString(message.productName());
        packet.appendString(message.customImage());
        packet.appendString(message.furnitureClassName());
    }
}
