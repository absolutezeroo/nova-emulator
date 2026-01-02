package com.nova.infra.adapter.in.network.packets.composers.game;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.game.GameListMessage;

/**
 * Composes GameList packet for client.
 */
public class GameListComposer extends PacketComposer<GameListMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GAME_CENTER_GAME_LIST;
    }

    @Override
    protected void write(PacketBuffer packet, GameListMessage message) {
        // No fields to write
    }
}
