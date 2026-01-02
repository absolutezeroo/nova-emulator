package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.PlayListMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes PlayList packet for client.
 */
@ComposesPacket(Outgoing.PLAYLIST)
public class PlayListComposer extends PacketComposer<PlayListMessage> {
@Override
    protected void write(PacketBuffer packet, PlayListMessage message) {
        // No fields to write
    }
}
