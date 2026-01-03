package com.nova.infra.adapter.network.packets.composers.catalog;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.catalog.CatalogPageExpirationMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes CatalogPageExpiration packet for client.
 */
@ComposesPacket(Outgoing.CATALOG_PAGE_EXPIRATION)
public class CatalogPageExpirationComposer extends PacketComposer<CatalogPageExpirationMessage> {
@Override
    protected void write(PacketBuffer packet, CatalogPageExpirationMessage message) {
        packet.appendInt(message.pageId());
        packet.appendString(message.pageName());
        packet.appendInt(message.secondsToExpiry());
        packet.appendString(message.image());
    }
}
