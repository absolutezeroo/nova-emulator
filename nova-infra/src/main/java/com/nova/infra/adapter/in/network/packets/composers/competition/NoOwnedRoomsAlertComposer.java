package com.nova.infra.adapter.in.network.packets.composers.competition;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.competition.NoOwnedRoomsAlertMessage;

/**
 * Composes NoOwnedRoomsAlert packet for client.
 */
public class NoOwnedRoomsAlertComposer extends PacketComposer<NoOwnedRoomsAlertMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.COMPETITION_NO_OWNED_ROOMS;
    }

    @Override
    protected void write(PacketBuffer packet, NoOwnedRoomsAlertMessage message) {
        // No fields to write
    }
}
