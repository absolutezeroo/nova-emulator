package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.NotEnoughBalanceMessage;

/**
 * Composes NotEnoughBalance packet for client.
 */
public class NotEnoughBalanceComposer extends PacketComposer<NotEnoughBalanceMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.NOT_ENOUGH_BALANCE;
    }

    @Override
    protected void write(PacketBuffer packet, NotEnoughBalanceMessage message) {
        packet.appendBoolean(message.notEnoughCredits());
        packet.appendBoolean(message.notEnoughActivityPoints());
        packet.appendInt(message.activityPointType());
    }
}
