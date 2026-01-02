package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.OfficialSongIdMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes OfficialSongId packet for client.
 */
@ComposesPacket(Outgoing.OFFICIAL_SONG_ID)
public class OfficialSongIdComposer extends PacketComposer<OfficialSongIdMessage> {
@Override
    protected void write(PacketBuffer packet, OfficialSongIdMessage message) {
        // No fields to write
    }
}
