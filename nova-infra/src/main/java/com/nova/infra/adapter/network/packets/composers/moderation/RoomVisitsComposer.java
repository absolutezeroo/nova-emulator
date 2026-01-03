package com.nova.infra.adapter.network.packets.composers.moderation;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.moderation.RoomVisitsMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomVisits packet for client.
 */
@ComposesPacket(Outgoing.MODTOOL_VISITED_ROOMS_USER)
public class RoomVisitsComposer extends PacketComposer<RoomVisitsMessage> {
@Override
    protected void write(PacketBuffer packet, RoomVisitsMessage message) {
        // No fields to write
    }
}
