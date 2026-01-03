package com.nova.infra.adapter.network.packets.composers.guide;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.guide.GuideTicketResolutionMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes GuideTicketResolution packet for client.
 */
@ComposesPacket(Outgoing.GUIDE_TICKET_RESOLUTION)
public class GuideTicketResolutionComposer extends PacketComposer<GuideTicketResolutionMessage> {
@Override
    protected void write(PacketBuffer packet, GuideTicketResolutionMessage message) {
        packet.appendInt(message.resolution());
    }
}
