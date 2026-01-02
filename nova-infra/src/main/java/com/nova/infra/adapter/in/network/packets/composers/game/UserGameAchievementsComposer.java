package com.nova.infra.adapter.in.network.packets.composers.game;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.game.UserGameAchievementsMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes UserGameAchievements packet for client.
 */
@ComposesPacket(Outgoing.GAME_CENTER_ACHIEVEMENTS)
public class UserGameAchievementsComposer extends PacketComposer<UserGameAchievementsMessage> {
@Override
    protected void write(PacketBuffer packet, UserGameAchievementsMessage message) {
        // No fields to write
    }
}
