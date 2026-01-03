package com.nova.infra.adapter.network.packets.composers.wired;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.wired.WiredRewardResultMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
