package com.nova.infra.adapter.in.network.packets.composers.game;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.game.GameListMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes GameList packet for client.
 */
@ComposesPacket(Outgoing.GAME_CENTER_GAME_LIST)
public class GameListComposer extends PacketComposer<GameListMessage> {
@Override
    protected void write(PacketBuffer packet, GameListMessage message) {
        // No fields to write
    }
}
