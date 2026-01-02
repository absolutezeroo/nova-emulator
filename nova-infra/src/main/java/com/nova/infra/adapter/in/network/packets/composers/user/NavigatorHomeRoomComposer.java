package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.NavigatorHomeRoomMessage;

/**
 * Composes NavigatorHomeRoom packet for client.
 */
public class NavigatorHomeRoomComposer extends PacketComposer<NavigatorHomeRoomMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_HOME_ROOM;
    }

    @Override
    protected void write(PacketBuffer packet, NavigatorHomeRoomMessage message) {
        packet.appendInt(message.homeRoomId());
        packet.appendInt(message.roomIdToEnter());
    }
}
