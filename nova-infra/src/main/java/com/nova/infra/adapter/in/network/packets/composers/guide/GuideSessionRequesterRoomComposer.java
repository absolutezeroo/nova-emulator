package com.nova.infra.adapter.in.network.packets.composers.guide;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.guide.GuideSessionRequesterRoomMessage;

/**
 * Composes GuideSessionRequesterRoom packet for client.
 */
public class GuideSessionRequesterRoomComposer extends PacketComposer<GuideSessionRequesterRoomMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GUIDE_SESSION_REQUESTER_ROOM;
    }

    @Override
    protected void write(PacketBuffer packet, GuideSessionRequesterRoomMessage message) {
        packet.appendInt(message.requesterRoomId());
    }
}
