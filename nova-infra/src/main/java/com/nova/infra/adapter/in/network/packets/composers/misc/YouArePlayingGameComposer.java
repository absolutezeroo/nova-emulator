package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.YouArePlayingGameMessage;

/**
 * Composes YouArePlayingGame packet for client.
 */
public class YouArePlayingGameComposer extends PacketComposer<YouArePlayingGameMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.PLAYING_GAME;
    }

    @Override
    protected void write(PacketBuffer packet, YouArePlayingGameMessage message) {
        packet.appendBoolean(message.isPlaying());
    }
}
