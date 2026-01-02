package com.nova.infra.adapter.in.network.packets.composers.guide;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.guide.GuideSessionStartedMessage;

/**
 * Composes GuideSessionStarted packet for client.
 */
public class GuideSessionStartedComposer extends PacketComposer<GuideSessionStartedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GUIDE_SESSION_STARTED;
    }

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
