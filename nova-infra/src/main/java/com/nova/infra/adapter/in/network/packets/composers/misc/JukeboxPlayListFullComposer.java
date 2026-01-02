package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.JukeboxPlayListFullMessage;

/**
 * Composes JukeboxPlayListFull packet for client.
 */
public class JukeboxPlayListFullComposer extends PacketComposer<JukeboxPlayListFullMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.JUKEBOX_PLAYLIST_FULL;
    }

    @Override
    protected void write(PacketBuffer packet, JukeboxPlayListFullMessage message) {
        // No fields to write
    }
}
