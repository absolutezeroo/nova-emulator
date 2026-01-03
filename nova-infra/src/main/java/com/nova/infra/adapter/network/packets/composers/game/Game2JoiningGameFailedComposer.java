package com.nova.infra.adapter.network.packets.composers.game;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.game.Game2JoiningGameFailedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes Game2JoiningGameFailed packet for client.
 */
@ComposesPacket(Outgoing.GAME_CENTER_JOINING_FAILED)
public class Game2JoiningGameFailedComposer extends PacketComposer<Game2JoiningGameFailedMessage> {
@Override
    protected void write(PacketBuffer packet, Game2JoiningGameFailedMessage message) {
        packet.appendInt(message.reason());
    }
}
