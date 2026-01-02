package com.nova.infra.adapter.in.network.packets.composers.guide;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.guide.GuideSessionErrorMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes GuideSessionError packet for client.
 */
@ComposesPacket(Outgoing.GUIDE_SESSION_ERROR)
public class GuideSessionErrorComposer extends PacketComposer<GuideSessionErrorMessage> {
@Override
    protected void write(PacketBuffer packet, GuideSessionErrorMessage message) {
        packet.appendInt(message.errorCode());
    }
}
