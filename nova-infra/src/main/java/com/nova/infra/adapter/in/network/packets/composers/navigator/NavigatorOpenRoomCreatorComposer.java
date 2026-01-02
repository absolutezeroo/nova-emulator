package com.nova.infra.adapter.in.network.packets.composers.navigator;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.navigator.NavigatorOpenRoomCreatorMessage;

/**
 * Composes NavigatorOpenRoomCreator packet for client.
 */
public class NavigatorOpenRoomCreatorComposer extends PacketComposer<NavigatorOpenRoomCreatorMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.NAVIGATOR_OPEN_ROOM_CREATOR;
    }

    @Override
    protected void write(PacketBuffer packet, NavigatorOpenRoomCreatorMessage message) {
        // No fields to write
    }
}
