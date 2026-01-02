package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.GameAchievementsMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes GameAchievements packet for client.
 */
@ComposesPacket(Outgoing.GAMEACHIEVEMENTS)
public class GameAchievementsComposer extends PacketComposer<GameAchievementsMessage> {
@Override
    protected void write(PacketBuffer packet, GameAchievementsMessage message) {
        // No fields to write
    }
}
