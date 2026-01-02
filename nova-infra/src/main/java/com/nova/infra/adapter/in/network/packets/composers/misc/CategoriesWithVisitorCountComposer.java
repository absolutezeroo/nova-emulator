package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.CategoriesWithVisitorCountMessage;

/**
 * Composes CategoriesWithVisitorCount packet for client.
 */
public class CategoriesWithVisitorCountComposer extends PacketComposer<CategoriesWithVisitorCountMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CATEGORIES_WITH_VISITOR_COUNT;
    }

    @Override
    protected void write(PacketBuffer packet, CategoriesWithVisitorCountMessage message) {
        // No fields to write
    }
}
