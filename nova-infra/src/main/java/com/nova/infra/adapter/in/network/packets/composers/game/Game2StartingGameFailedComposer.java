package com.nova.infra.adapter.in.network.packets.composers.game;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.game.Game2StartingGameFailedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes Game2StartingGameFailed packet for client.
 */
@ComposesPacket(Outgoing.GAME_CENTER_STARTING_GAME_FAILED)
public class Game2StartingGameFailedComposer extends PacketComposer<Game2StartingGameFailedMessage> {
@Override
    protected void write(PacketBuffer packet, Game2StartingGameFailedMessage message) {
        packet.appendInt(message.reason());
    }
}
