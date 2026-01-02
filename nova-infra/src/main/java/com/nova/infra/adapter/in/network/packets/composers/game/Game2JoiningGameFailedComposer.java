package com.nova.infra.adapter.in.network.packets.composers.game;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.game.Game2JoiningGameFailedMessage;

/**
 * Composes Game2JoiningGameFailed packet for client.
 */
public class Game2JoiningGameFailedComposer extends PacketComposer<Game2JoiningGameFailedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GAME_CENTER_JOINING_FAILED;
    }

    @Override
    protected void write(PacketBuffer packet, Game2JoiningGameFailedMessage message) {
        packet.appendInt(message.reason());
    }
}
