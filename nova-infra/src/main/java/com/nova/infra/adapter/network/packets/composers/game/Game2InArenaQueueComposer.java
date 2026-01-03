package com.nova.infra.adapter.network.packets.composers.game;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.game.Game2InArenaQueueMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes Game2InArenaQueue packet for client.
 */
@ComposesPacket(Outgoing.GAME_CENTER_IN_ARENA_QUEUE)
public class Game2InArenaQueueComposer extends PacketComposer<Game2InArenaQueueMessage> {
@Override
    protected void write(PacketBuffer packet, Game2InArenaQueueMessage message) {
        packet.appendInt(message.position());
    }
}
