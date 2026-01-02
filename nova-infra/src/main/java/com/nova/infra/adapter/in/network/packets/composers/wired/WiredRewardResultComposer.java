package com.nova.infra.adapter.in.network.packets.composers.wired;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.wired.WiredRewardResultMessage;

/**
 * Composes WiredRewardResult packet for client.
 */
public class WiredRewardResultComposer extends PacketComposer<WiredRewardResultMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.WIRED_REWARD;
    }

    @Override
    protected void write(PacketBuffer packet, WiredRewardResultMessage message) {
        packet.appendInt(message.reason());
    }
}
