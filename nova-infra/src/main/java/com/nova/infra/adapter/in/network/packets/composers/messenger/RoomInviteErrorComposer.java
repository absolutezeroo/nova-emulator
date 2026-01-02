package com.nova.infra.adapter.in.network.packets.composers.messenger;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.RoomInviteErrorMessage;

/**
 * Composes RoomInviteError packet for client.
 */
public class RoomInviteErrorComposer extends PacketComposer<RoomInviteErrorMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MESSENGER_INVITE_ERROR;
    }

    @Override
    protected void write(PacketBuffer packet, RoomInviteErrorMessage message) {
        packet.appendInt(message.errorCode());
    }
}
