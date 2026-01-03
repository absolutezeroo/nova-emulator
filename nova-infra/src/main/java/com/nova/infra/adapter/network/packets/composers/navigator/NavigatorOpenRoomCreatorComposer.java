package com.nova.infra.adapter.network.packets.composers.navigator;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.navigator.NavigatorOpenRoomCreatorMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes NavigatorOpenRoomCreator packet for client.
 */
@ComposesPacket(Outgoing.NAVIGATOR_OPEN_ROOM_CREATOR)
public class NavigatorOpenRoomCreatorComposer extends PacketComposer<NavigatorOpenRoomCreatorMessage> {
@Override
    protected void write(PacketBuffer packet, NavigatorOpenRoomCreatorMessage message) {
        // No fields to write
    }
}
