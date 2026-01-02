package com.nova.infra.adapter.in.network.packets.composers.game;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.game.Game2GameDirectoryStatusMessage;

/**
 * Composes Game2GameDirectoryStatus packet for client.
 */
public class Game2GameDirectoryStatusComposer extends PacketComposer<Game2GameDirectoryStatusMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GAME_CENTER_DIRECTORY_STATUS;
    }

    @Override
    protected void write(PacketBuffer packet, Game2GameDirectoryStatusMessage message) {
        packet.appendInt(message.status());
        packet.appendInt(message.blockLength());
        packet.appendInt(message.gamesPlayed());
        packet.appendInt(message.freeGamesLeft());
    }
}
