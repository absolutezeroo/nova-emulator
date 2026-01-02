package com.nova.infra.adapter.in.network.packets.composers.guide;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.guide.GuideSessionMessage;

/**
 * Composes GuideSession packet for client.
 */
public class GuideSessionComposer extends PacketComposer<GuideSessionMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GUIDE_SESSION_MESSAGE;
    }

    @Override
    protected void write(PacketBuffer packet, GuideSessionMessage message) {
        packet.appendString(message.chatMessage());
        packet.appendInt(message.senderId());
    }
}
