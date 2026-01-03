package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.JukeboxPlayListFullMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes JukeboxPlayListFull packet for client.
 */
@ComposesPacket(Outgoing.JUKEBOX_PLAYLIST_FULL)
public class JukeboxPlayListFullComposer extends PacketComposer<JukeboxPlayListFullMessage> {
@Override
    protected void write(PacketBuffer packet, JukeboxPlayListFullMessage message) {
        // No fields to write
    }
}
