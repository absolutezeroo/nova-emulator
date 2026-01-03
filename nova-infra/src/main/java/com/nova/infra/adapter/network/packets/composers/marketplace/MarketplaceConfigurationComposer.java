package com.nova.infra.adapter.network.packets.composers.marketplace;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.marketplace.MarketplaceConfigurationMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes MarketplaceConfiguration packet for client.
 */
@ComposesPacket(Outgoing.MARKETPLACE_CONFIG)
public class MarketplaceConfigurationComposer extends PacketComposer<MarketplaceConfigurationMessage> {
@Override
    protected void write(PacketBuffer packet, MarketplaceConfigurationMessage message) {
        packet.appendBoolean(message.enabled());
        packet.appendInt(message.commission());
        packet.appendInt(message.credits());
        packet.appendInt(message.advertisements());
        packet.appendInt(message.minimumPrice());
        packet.appendInt(message.maximumPrice());
        packet.appendInt(message.offerTime());
        packet.appendInt(message.displayTime());
    }
}
