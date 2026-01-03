package com.nova.infra.adapter.network.packets.composers.competition;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.competition.NoOwnedRoomsAlertMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes NoOwnedRoomsAlert packet for client.
 */
@ComposesPacket(Outgoing.COMPETITION_NO_OWNED_ROOMS)
public class NoOwnedRoomsAlertComposer extends PacketComposer<NoOwnedRoomsAlertMessage> {
@Override
    protected void write(PacketBuffer packet, NoOwnedRoomsAlertMessage message) {
        // No fields to write
    }
}
