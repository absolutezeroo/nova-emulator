package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.JukeboxSongDisksMessage;

/**
 * Composes JukeboxSongDisks packet for client.
 */
public class JukeboxSongDisksComposer extends PacketComposer<JukeboxSongDisksMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.JUKEBOX_SONG_DISKS;
    }

    @Override
    protected void write(PacketBuffer packet, JukeboxSongDisksMessage message) {
        // No fields to write
    }
}
