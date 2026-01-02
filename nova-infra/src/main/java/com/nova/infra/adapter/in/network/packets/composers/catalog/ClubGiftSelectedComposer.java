package com.nova.infra.adapter.in.network.packets.composers.catalog;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.catalog.ClubGiftSelectedMessage;

/**
 * Composes ClubGiftSelected packet for client.
 */
public class ClubGiftSelectedComposer extends PacketComposer<ClubGiftSelectedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CLUB_GIFT_SELECTED;
    }

    @Override
    protected void write(PacketBuffer packet, ClubGiftSelectedMessage message) {
        packet.appendString(message.productCode());
    }
}
