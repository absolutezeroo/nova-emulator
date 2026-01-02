package com.nova.infra.adapter.in.network.packets.composers.guide;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.guide.GuideSessionDetachedMessage;

/**
 * Composes GuideSessionDetached packet for client.
 */
public class GuideSessionDetachedComposer extends PacketComposer<GuideSessionDetachedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GUIDE_SESSION_DETACHED;
    }

    @Override
    protected void write(PacketBuffer packet, GuideSessionDetachedMessage message) {
        // No fields to write
    }
}
