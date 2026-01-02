package com.nova.infra.adapter.in.network.packets.composers.guide;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.guide.GuideSessionInvitedToGuideRoomMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes GuideSessionInvitedToGuideRoom packet for client.
 */
@ComposesPacket(Outgoing.GUIDE_SESSION_INVITED_TO_GUIDE_ROOM)
public class GuideSessionInvitedToGuideRoomComposer extends PacketComposer<GuideSessionInvitedToGuideRoomMessage> {
@Override
    protected void write(PacketBuffer packet, GuideSessionInvitedToGuideRoomMessage message) {
        packet.appendInt(message.roomId());
        packet.appendString(message.roomName());
    }
}
