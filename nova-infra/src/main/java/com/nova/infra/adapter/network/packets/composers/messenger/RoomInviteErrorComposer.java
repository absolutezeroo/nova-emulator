package com.nova.infra.adapter.network.packets.composers.messenger;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.messenger.RoomInviteErrorMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomInviteError packet for client.
 */
@ComposesPacket(Outgoing.MESSENGER_INVITE_ERROR)
public class RoomInviteErrorComposer extends PacketComposer<RoomInviteErrorMessage> {
@Override
    protected void write(PacketBuffer packet, RoomInviteErrorMessage message) {
        packet.appendInt(message.errorCode());
    }
}
