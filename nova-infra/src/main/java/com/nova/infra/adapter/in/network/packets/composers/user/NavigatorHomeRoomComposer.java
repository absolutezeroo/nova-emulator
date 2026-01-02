package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.NavigatorHomeRoomMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes NavigatorHomeRoom packet for client.
 */
@ComposesPacket(Outgoing.USER_HOME_ROOM)
public class NavigatorHomeRoomComposer extends PacketComposer<NavigatorHomeRoomMessage> {
@Override
    protected void write(PacketBuffer packet, NavigatorHomeRoomMessage message) {
        packet.appendInt(message.homeRoomId());
        packet.appendInt(message.roomIdToEnter());
    }
}
