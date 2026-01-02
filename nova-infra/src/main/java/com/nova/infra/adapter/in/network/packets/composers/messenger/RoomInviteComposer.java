package com.nova.infra.adapter.in.network.packets.composers.messenger;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.RoomInviteMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomInvite packet for client.
 */
@ComposesPacket(Outgoing.MESSENGER_INVITE)
public class RoomInviteComposer extends PacketComposer<RoomInviteMessage> {
@Override
    protected void write(PacketBuffer packet, RoomInviteMessage message) {
        packet.appendInt(message.errorCode());
    }
}
