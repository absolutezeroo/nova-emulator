package com.nova.infra.adapter.network.packets.composers.user;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.user.NavigatorHomeRoomMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
