package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.TraxSongInfoMessage;

/**
 * Composes TraxSongInfo packet for client.
 */
public class TraxSongInfoComposer extends PacketComposer<TraxSongInfoMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.TRAX_SONG_INFO;
    }

    @Override
    protected void write(PacketBuffer packet, TraxSongInfoMessage message) {
        // No fields to write
    }
}
