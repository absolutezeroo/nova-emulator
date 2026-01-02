package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.YouAreSpectatorMessage;

/**
 * Composes YouAreSpectator packet for client.
 */
public class YouAreSpectatorComposer extends PacketComposer<YouAreSpectatorMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_SPECTATOR;
    }

    @Override
    protected void write(PacketBuffer packet, YouAreSpectatorMessage message) {
        // No fields to write
    }
}
