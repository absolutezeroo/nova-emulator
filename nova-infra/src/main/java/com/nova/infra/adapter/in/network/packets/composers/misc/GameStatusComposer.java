package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.GameStatusMessage;

/**
 * Composes GameStatus packet for client.
 */
public class GameStatusComposer extends PacketComposer<GameStatusMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GAMESTATUSMESSAGE;
    }

    @Override
    protected void write(PacketBuffer packet, GameStatusMessage message) {
        packet.appendInt(message.gameTypeId());
        packet.appendInt(message.freeGamesLeft());
        packet.appendInt(message.gamesPlayedTotal());
    }
}
