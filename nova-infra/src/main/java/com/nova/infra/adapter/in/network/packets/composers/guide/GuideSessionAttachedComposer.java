package com.nova.infra.adapter.in.network.packets.composers.guide;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.guide.GuideSessionAttachedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes GuideSessionAttached packet for client.
 */
@ComposesPacket(Outgoing.GUIDE_SESSION_ATTACHED)
public class GuideSessionAttachedComposer extends PacketComposer<GuideSessionAttachedMessage> {
@Override
    protected void write(PacketBuffer packet, GuideSessionAttachedMessage message) {
        packet.appendBoolean(message.asGuide());
        packet.appendInt(message.helpRequestType());
        packet.appendString(message.helpRequestDescription());
        packet.appendInt(message.roleSpecificWaitTime());
    }
}
