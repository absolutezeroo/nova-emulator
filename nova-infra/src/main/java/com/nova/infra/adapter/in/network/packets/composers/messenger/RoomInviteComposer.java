package com.nova.infra.adapter.in.network.packets.composers.messenger;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.RoomInviteMessage;

/**
 * Composes RoomInvite packet for client.
 */
public class RoomInviteComposer extends PacketComposer<RoomInviteMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MESSENGER_INVITE;
    }

    @Override
    protected void write(PacketBuffer packet, RoomInviteMessage message) {
        packet.appendInt(message.errorCode());
    }
}
