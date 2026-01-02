package com.nova.infra.adapter.in.network.packets.composers.guide;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.guide.GuideSessionEndedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes GuideSessionEnded packet for client.
 */
@ComposesPacket(Outgoing.GUIDE_SESSION_ENDED)
public class GuideSessionEndedComposer extends PacketComposer<GuideSessionEndedMessage> {
@Override
    protected void write(PacketBuffer packet, GuideSessionEndedMessage message) {
        packet.appendInt(message.endReason());
    }
}
