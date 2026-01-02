package com.nova.infra.adapter.in.network.packets.composers.guide;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.guide.GuideSessionRequesterRoomMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes GuideSessionRequesterRoom packet for client.
 */
@ComposesPacket(Outgoing.GUIDE_SESSION_REQUESTER_ROOM)
public class GuideSessionRequesterRoomComposer extends PacketComposer<GuideSessionRequesterRoomMessage> {
@Override
    protected void write(PacketBuffer packet, GuideSessionRequesterRoomMessage message) {
        packet.appendInt(message.requesterRoomId());
    }
}
