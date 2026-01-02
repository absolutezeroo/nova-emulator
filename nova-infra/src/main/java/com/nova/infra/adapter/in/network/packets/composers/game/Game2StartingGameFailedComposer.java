package com.nova.infra.adapter.in.network.packets.composers.game;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.game.Game2StartingGameFailedMessage;

/**
 * Composes Game2StartingGameFailed packet for client.
 */
public class Game2StartingGameFailedComposer extends PacketComposer<Game2StartingGameFailedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GAME_CENTER_STARTING_GAME_FAILED;
    }

    @Override
    protected void write(PacketBuffer packet, Game2StartingGameFailedMessage message) {
        packet.appendInt(message.reason());
    }
}
