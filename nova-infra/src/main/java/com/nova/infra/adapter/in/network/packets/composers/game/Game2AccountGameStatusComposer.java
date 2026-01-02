package com.nova.infra.adapter.in.network.packets.composers.game;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.game.Game2AccountGameStatusMessage;

/**
 * Composes Game2AccountGameStatus packet for client.
 */
public class Game2AccountGameStatusComposer extends PacketComposer<Game2AccountGameStatusMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GAME_CENTER_STATUS;
    }

    @Override
    protected void write(PacketBuffer packet, Game2AccountGameStatusMessage message) {
        packet.appendInt(message.gameTypeId());
        packet.appendInt(message.freeGamesLeft());
        packet.appendInt(message.gamesPlayedTotal());
    }
}
