package com.nova.infra.adapter.in.network.packets.composers.guide;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.guide.GuideSessionDetachedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes GuideSessionDetached packet for client.
 */
@ComposesPacket(Outgoing.GUIDE_SESSION_DETACHED)
public class GuideSessionDetachedComposer extends PacketComposer<GuideSessionDetachedMessage> {
@Override
    protected void write(PacketBuffer packet, GuideSessionDetachedMessage message) {
        // No fields to write
    }
}
