package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.GameInviteMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes GameInvite packet for client.
 */
@ComposesPacket(Outgoing.GAMEINVITE)
public class GameInviteComposer extends PacketComposer<GameInviteMessage> {
@Override
    protected void write(PacketBuffer packet, GameInviteMessage message) {
        packet.appendInt(message.gameTypeId());
        packet.appendInt(message.inviterId());
    }
}
