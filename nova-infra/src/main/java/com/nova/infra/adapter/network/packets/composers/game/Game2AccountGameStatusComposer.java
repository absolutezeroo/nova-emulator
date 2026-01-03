package com.nova.infra.adapter.network.packets.composers.game;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.game.Game2AccountGameStatusMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes Game2AccountGameStatus packet for client.
 */
@ComposesPacket(Outgoing.GAME_CENTER_STATUS)
public class Game2AccountGameStatusComposer extends PacketComposer<Game2AccountGameStatusMessage> {
@Override
    protected void write(PacketBuffer packet, Game2AccountGameStatusMessage message) {
        packet.appendInt(message.gameTypeId());
        packet.appendInt(message.freeGamesLeft());
        packet.appendInt(message.gamesPlayedTotal());
    }
}
