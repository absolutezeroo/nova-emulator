package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.OfficialSongIdMessage;

/**
 * Composes OfficialSongId packet for client.
 */
public class OfficialSongIdComposer extends PacketComposer<OfficialSongIdMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.OFFICIAL_SONG_ID;
    }

    @Override
    protected void write(PacketBuffer packet, OfficialSongIdMessage message) {
        // No fields to write
    }
}
