package com.nova.infra.adapter.in.network.packets.composers.guide;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.guide.GuideTicketResolutionMessage;

/**
 * Composes GuideTicketResolution packet for client.
 */
public class GuideTicketResolutionComposer extends PacketComposer<GuideTicketResolutionMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GUIDE_TICKET_RESOLUTION;
    }

    @Override
    protected void write(PacketBuffer packet, GuideTicketResolutionMessage message) {
        packet.appendInt(message.resolution());
    }
}
