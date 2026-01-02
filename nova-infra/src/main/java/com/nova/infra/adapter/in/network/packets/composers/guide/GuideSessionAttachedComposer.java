package com.nova.infra.adapter.in.network.packets.composers.guide;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.guide.GuideSessionAttachedMessage;

/**
 * Composes GuideSessionAttached packet for client.
 */
public class GuideSessionAttachedComposer extends PacketComposer<GuideSessionAttachedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GUIDE_SESSION_ATTACHED;
    }

    @Override
    protected void write(PacketBuffer packet, GuideSessionAttachedMessage message) {
        packet.appendBoolean(message.asGuide());
        packet.appendInt(message.helpRequestType());
        packet.appendString(message.helpRequestDescription());
        packet.appendInt(message.roleSpecificWaitTime());
    }
}
