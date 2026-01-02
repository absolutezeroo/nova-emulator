package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.TraxSongInfoMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes TraxSongInfo packet for client.
 */
@ComposesPacket(Outgoing.TRAX_SONG_INFO)
public class TraxSongInfoComposer extends PacketComposer<TraxSongInfoMessage> {
@Override
    protected void write(PacketBuffer packet, TraxSongInfoMessage message) {
        // No fields to write
    }
}
