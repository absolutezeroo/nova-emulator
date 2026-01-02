package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.GiftWrappingConfigurationMessage;

/**
 * Composes GiftWrappingConfiguration packet for client.
 */
public class GiftWrappingConfigurationComposer extends PacketComposer<GiftWrappingConfigurationMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GIFT_WRAPPER_CONFIG;
    }

    @Override
    protected void write(PacketBuffer packet, GiftWrappingConfigurationMessage message) {
        packet.appendBoolean(message.isEnabled());
        packet.appendInt(message.price());
    }
}
