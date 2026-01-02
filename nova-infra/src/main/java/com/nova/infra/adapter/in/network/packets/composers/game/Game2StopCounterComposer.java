package com.nova.infra.adapter.in.network.packets.composers.game;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.game.Game2StopCounterMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes Game2StopCounter packet for client.
 */
@ComposesPacket(Outgoing.GAME_CENTER_STOP_COUNTER)
public class Game2StopCounterComposer extends PacketComposer<Game2StopCounterMessage> {
@Override
    protected void write(PacketBuffer packet, Game2StopCounterMessage message) {
        // No fields to write
    }
}
