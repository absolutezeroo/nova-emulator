package com.nova.infra.adapter.in.network.packets.composers.guide;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.guide.GuideSessionEndedMessage;

/**
 * Composes GuideSessionEnded packet for client.
 */
public class GuideSessionEndedComposer extends PacketComposer<GuideSessionEndedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GUIDE_SESSION_ENDED;
    }

    @Override
    protected void write(PacketBuffer packet, GuideSessionEndedMessage message) {
        packet.appendInt(message.endReason());
    }
}
