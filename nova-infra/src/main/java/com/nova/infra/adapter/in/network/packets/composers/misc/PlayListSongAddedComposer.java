package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.PlayListSongAddedMessage;

/**
 * Composes PlayListSongAdded packet for client.
 */
public class PlayListSongAddedComposer extends PacketComposer<PlayListSongAddedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.PLAYLIST_SONG_ADDED;
    }

    @Override
    protected void write(PacketBuffer packet, PlayListSongAddedMessage message) {
        // No fields to write
    }
}
