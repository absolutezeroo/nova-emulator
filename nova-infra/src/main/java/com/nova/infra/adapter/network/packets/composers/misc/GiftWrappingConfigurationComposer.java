package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.GiftWrappingConfigurationMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes GiftWrappingConfiguration packet for client.
 */
@ComposesPacket(Outgoing.GIFT_WRAPPER_CONFIG)
public class GiftWrappingConfigurationComposer extends PacketComposer<GiftWrappingConfigurationMessage> {
@Override
    protected void write(PacketBuffer packet, GiftWrappingConfigurationMessage message) {
        packet.appendBoolean(message.isEnabled());
        packet.appendInt(message.price());
    }
}
