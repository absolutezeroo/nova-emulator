package com.nova.infra.adapter.in.network.packets.composers.marketplace;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.marketplace.MarketplaceConfigurationMessage;

/**
 * Composes MarketplaceConfiguration packet for client.
 */
public class MarketplaceConfigurationComposer extends PacketComposer<MarketplaceConfigurationMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MARKETPLACE_CONFIG;
    }

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
