package com.nova.infra.adapter.network.packets.composers.game;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.game.Game2UserLeftGameMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes Game2UserLeftGame packet for client.
 */
@ComposesPacket(Outgoing.GAME_CENTER_USER_LEFT_GAME)
public class Game2UserLeftGameComposer extends PacketComposer<Game2UserLeftGameMessage> {
@Override
    protected void write(PacketBuffer packet, Game2UserLeftGameMessage message) {
        packet.appendInt(message.userId());
    }
}
