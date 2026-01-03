package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.YouArePlayingGameMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes YouArePlayingGame packet for client.
 */
@ComposesPacket(Outgoing.PLAYING_GAME)
public class YouArePlayingGameComposer extends PacketComposer<YouArePlayingGameMessage> {
@Override
    protected void write(PacketBuffer packet, YouArePlayingGameMessage message) {
        packet.appendBoolean(message.isPlaying());
    }
}
