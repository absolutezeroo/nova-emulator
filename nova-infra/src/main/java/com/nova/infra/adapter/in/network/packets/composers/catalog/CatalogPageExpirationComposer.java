package com.nova.infra.adapter.in.network.packets.composers.catalog;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.catalog.CatalogPageExpirationMessage;

/**
 * Composes CatalogPageExpiration packet for client.
 */
public class CatalogPageExpirationComposer extends PacketComposer<CatalogPageExpirationMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CATALOG_PAGE_EXPIRATION;
    }

    @Override
    protected void write(PacketBuffer packet, CatalogPageExpirationMessage message) {
        packet.appendInt(message.pageId());
        packet.appendString(message.pageName());
        packet.appendInt(message.secondsToExpiry());
        packet.appendString(message.image());
    }
}
