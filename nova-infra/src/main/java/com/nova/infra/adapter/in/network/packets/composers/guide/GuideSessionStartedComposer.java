package com.nova.infra.adapter.in.network.packets.composers.guide;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.guide.GuideSessionStartedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes GuideSessionStarted packet for client.
 */
@ComposesPacket(Outgoing.GUIDE_SESSION_STARTED)
public class GuideSessionStartedComposer extends PacketComposer<GuideSessionStartedMessage> {
@Override
    protected void write(PacketBuffer packet, GuideSessionStartedMessage message) {
        packet.appendInt(message.requesterUserId());
        packet.appendString(message.requesterName());
        packet.appendString(message.requesterFigure());
        packet.appendInt(message.guideUserId());
        packet.appendString(message.guideName());
        packet.appendString(message.guideFigure());
    }
}
