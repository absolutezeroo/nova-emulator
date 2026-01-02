package com.nova.infra.adapter.in.network.packets.composers.guide;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.guide.GuideTicketCreationResultMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes GuideTicketCreationResult packet for client.
 */
@ComposesPacket(Outgoing.GUIDE_TICKET_CREATION_RESULT)
public class GuideTicketCreationResultComposer extends PacketComposer<GuideTicketCreationResultMessage> {
@Override
    protected void write(PacketBuffer packet, GuideTicketCreationResultMessage message) {
        packet.appendInt(message.result());
    }
}
