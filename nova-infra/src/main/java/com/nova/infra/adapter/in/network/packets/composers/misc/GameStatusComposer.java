package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.GameStatusMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes GameStatus packet for client.
 */
@ComposesPacket(Outgoing.GAMESTATUSMESSAGE)
public class GameStatusComposer extends PacketComposer<GameStatusMessage> {
@Override
    protected void write(PacketBuffer packet, GameStatusMessage message) {
        packet.appendInt(message.gameTypeId());
        packet.appendInt(message.freeGamesLeft());
        packet.appendInt(message.gamesPlayedTotal());
    }
}
