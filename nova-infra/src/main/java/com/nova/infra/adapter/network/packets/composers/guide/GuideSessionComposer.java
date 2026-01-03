package com.nova.infra.adapter.network.packets.composers.guide;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.guide.GuideSessionMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes GuideSession packet for client.
 */
@ComposesPacket(Outgoing.GUIDE_SESSION_MESSAGE)
public class GuideSessionComposer extends PacketComposer<GuideSessionMessage> {
@Override
    protected void write(PacketBuffer packet, GuideSessionMessage message) {
        packet.appendString(message.chatMessage());
        packet.appendInt(message.senderId());
    }
}
