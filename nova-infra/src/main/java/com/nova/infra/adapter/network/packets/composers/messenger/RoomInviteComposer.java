package com.nova.infra.adapter.network.packets.composers.messenger;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.messenger.RoomInviteMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
