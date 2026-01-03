package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.JukeboxSongDisksMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes JukeboxSongDisks packet for client.
 */
@ComposesPacket(Outgoing.JUKEBOX_SONG_DISKS)
public class JukeboxSongDisksComposer extends PacketComposer<JukeboxSongDisksMessage> {
@Override
    protected void write(PacketBuffer packet, JukeboxSongDisksMessage message) {
        // No fields to write
    }
}
