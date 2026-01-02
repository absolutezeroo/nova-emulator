package com.nova.infra.adapter.in.network.packets.composers.wired;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.wired.WiredRewardResultMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes WiredRewardResult packet for client.
 */
@ComposesPacket(Outgoing.WIRED_REWARD)
public class WiredRewardResultComposer extends PacketComposer<WiredRewardResultMessage> {
@Override
    protected void write(PacketBuffer packet, WiredRewardResultMessage message) {
        packet.appendInt(message.reason());
    }
}
