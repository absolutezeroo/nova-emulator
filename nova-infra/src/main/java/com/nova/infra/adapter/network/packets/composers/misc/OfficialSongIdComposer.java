package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.OfficialSongIdMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
