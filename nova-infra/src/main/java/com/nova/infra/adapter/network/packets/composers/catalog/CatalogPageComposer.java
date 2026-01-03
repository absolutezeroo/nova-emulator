package com.nova.infra.adapter.network.packets.composers.catalog;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.catalog.CatalogPageMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes CatalogPage packet for client.
 */
@ComposesPacket(Outgoing.CATALOG_PAGE)
public class CatalogPageComposer extends PacketComposer<CatalogPageMessage> {
@Override
    protected void write(PacketBuffer packet, CatalogPageMessage message) {
        packet.appendInt(message.pageId());
        packet.appendString(message.pageName());
        packet.appendInt(message.secondsToExpiry());
        packet.appendString(message.image());
    }
}
