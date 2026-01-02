package com.nova.infra.adapter.in.network.packets.composers.moderation;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.moderation.RoomVisitsMessage;

/**
 * Composes RoomVisits packet for client.
 */
public class RoomVisitsComposer extends PacketComposer<RoomVisitsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MODTOOL_VISITED_ROOMS_USER;
    }

    @Override
    protected void write(PacketBuffer packet, RoomVisitsMessage message) {
        // No fields to write
    }
}
