package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.NotEnoughBalanceMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes NotEnoughBalance packet for client.
 */
@ComposesPacket(Outgoing.NOT_ENOUGH_BALANCE)
public class NotEnoughBalanceComposer extends PacketComposer<NotEnoughBalanceMessage> {
@Override
    protected void write(PacketBuffer packet, NotEnoughBalanceMessage message) {
        packet.appendBoolean(message.notEnoughCredits());
        packet.appendBoolean(message.notEnoughActivityPoints());
        packet.appendInt(message.activityPointType());
    }
}
