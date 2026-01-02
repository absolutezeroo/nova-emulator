package com.nova.infra.adapter.in.network.packets.composers.catalog;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.catalog.ClubGiftSelectedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes ClubGiftSelected packet for client.
 */
@ComposesPacket(Outgoing.CLUB_GIFT_SELECTED)
public class ClubGiftSelectedComposer extends PacketComposer<ClubGiftSelectedMessage> {
@Override
    protected void write(PacketBuffer packet, ClubGiftSelectedMessage message) {
        packet.appendString(message.productCode());
    }
}
