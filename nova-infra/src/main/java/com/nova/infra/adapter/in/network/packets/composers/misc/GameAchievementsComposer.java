package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.GameAchievementsMessage;

/**
 * Composes GameAchievements packet for client.
 */
public class GameAchievementsComposer extends PacketComposer<GameAchievementsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GAMEACHIEVEMENTS;
    }

    @Override
    protected void write(PacketBuffer packet, GameAchievementsMessage message) {
        // No fields to write
    }
}
