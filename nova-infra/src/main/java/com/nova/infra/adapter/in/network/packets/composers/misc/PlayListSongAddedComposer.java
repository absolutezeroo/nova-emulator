package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.PlayListSongAddedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes PlayListSongAdded packet for client.
 */
@ComposesPacket(Outgoing.PLAYLIST_SONG_ADDED)
public class PlayListSongAddedComposer extends PacketComposer<PlayListSongAddedMessage> {
@Override
    protected void write(PacketBuffer packet, PlayListSongAddedMessage message) {
        // No fields to write
    }
}
