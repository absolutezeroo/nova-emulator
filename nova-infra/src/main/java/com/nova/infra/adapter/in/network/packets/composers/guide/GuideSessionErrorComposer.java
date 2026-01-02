package com.nova.infra.adapter.in.network.packets.composers.guide;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.guide.GuideSessionErrorMessage;

/**
 * Composes GuideSessionError packet for client.
 */
public class GuideSessionErrorComposer extends PacketComposer<GuideSessionErrorMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GUIDE_SESSION_ERROR;
    }

    @Override
    protected void write(PacketBuffer packet, GuideSessionErrorMessage message) {
        packet.appendInt(message.errorCode());
    }
}
