package com.nova.infra.adapter.in.network.packets.composers.catalog;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.catalog.CatalogPublishedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes CatalogPublished packet for client.
 */
@ComposesPacket(Outgoing.CATALOG_PUBLISHED)
public class CatalogPublishedComposer extends PacketComposer<CatalogPublishedMessage> {
@Override
    protected void write(PacketBuffer packet, CatalogPublishedMessage message) {
        packet.appendBoolean(message.instantlyRefreshCatalogue());
        packet.appendString(message.newFurniDataHash());
    }
}
