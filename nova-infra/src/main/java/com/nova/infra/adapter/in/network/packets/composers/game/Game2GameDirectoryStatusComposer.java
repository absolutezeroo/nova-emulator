package com.nova.infra.adapter.in.network.packets.composers.game;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.game.Game2GameDirectoryStatusMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes Game2GameDirectoryStatus packet for client.
 */
@ComposesPacket(Outgoing.GAME_CENTER_DIRECTORY_STATUS)
public class Game2GameDirectoryStatusComposer extends PacketComposer<Game2GameDirectoryStatusMessage> {
@Override
    protected void write(PacketBuffer packet, Game2GameDirectoryStatusMessage message) {
        packet.appendInt(message.status());
        packet.appendInt(message.blockLength());
        packet.appendInt(message.gamesPlayed());
        packet.appendInt(message.freeGamesLeft());
    }
}
