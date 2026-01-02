package com.nova.infra.adapter.in.network.packets.composers.guide;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.guide.GuideTicketCreationResultMessage;

/**
 * Composes GuideTicketCreationResult packet for client.
 */
public class GuideTicketCreationResultComposer extends PacketComposer<GuideTicketCreationResultMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GUIDE_TICKET_CREATION_RESULT;
    }

    @Override
    protected void write(PacketBuffer packet, GuideTicketCreationResultMessage message) {
        packet.appendInt(message.result());
    }
}
