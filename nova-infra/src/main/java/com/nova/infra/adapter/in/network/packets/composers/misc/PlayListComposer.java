package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.PlayListMessage;

/**
 * Composes PlayList packet for client.
 */
public class PlayListComposer extends PacketComposer<PlayListMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.PLAYLIST;
    }

    @Override
    protected void write(PacketBuffer packet, PlayListMessage message) {
        // No fields to write
    }
}
