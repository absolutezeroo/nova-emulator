package com.nova.infra.adapter.in.network.packets.composers.game;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.game.Game2UserLeftGameMessage;

/**
 * Composes Game2UserLeftGame packet for client.
 */
public class Game2UserLeftGameComposer extends PacketComposer<Game2UserLeftGameMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GAME_CENTER_USER_LEFT_GAME;
    }

    @Override
    protected void write(PacketBuffer packet, Game2UserLeftGameMessage message) {
        packet.appendInt(message.userId());
    }
}
