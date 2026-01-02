package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.PromoArticlesMessage;

/**
 * Composes PromoArticles packet for client.
 */
public class PromoArticlesComposer extends PacketComposer<PromoArticlesMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.PROMO_ARTICLES;
    }

    @Override
    protected void write(PacketBuffer packet, PromoArticlesMessage message) {
        // No fields to write
    }
}
