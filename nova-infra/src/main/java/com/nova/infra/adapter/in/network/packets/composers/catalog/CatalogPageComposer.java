package com.nova.infra.adapter.in.network.packets.composers.catalog;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.catalog.CatalogPageMessage;

/**
 * Composes CatalogPage packet for client.
 */
public class CatalogPageComposer extends PacketComposer<CatalogPageMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CATALOG_PAGE;
    }

    @Override
    protected void write(PacketBuffer packet, CatalogPageMessage message) {
        packet.appendInt(message.pageId());
        packet.appendString(message.pageName());
        packet.appendInt(message.secondsToExpiry());
        packet.appendString(message.image());
    }
}
