package com.nova.infra.adapter.in.network.packets.composers.game;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.game.UserGameAchievementsMessage;

/**
 * Composes UserGameAchievements packet for client.
 */
public class UserGameAchievementsComposer extends PacketComposer<UserGameAchievementsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GAME_CENTER_ACHIEVEMENTS;
    }

    @Override
    protected void write(PacketBuffer packet, UserGameAchievementsMessage message) {
        // No fields to write
    }
}
