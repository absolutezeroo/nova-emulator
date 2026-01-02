package com.nova.infra.adapter.in.network.packets.composers.catalog;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.catalog.ClubGiftInfoMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes ClubGiftInfo packet for client.
 */
@ComposesPacket(Outgoing.CLUB_GIFT_INFO)
public class ClubGiftInfoComposer extends PacketComposer<ClubGiftInfoMessage> {
@Override
    protected void write(PacketBuffer packet, ClubGiftInfoMessage message) {
        packet.appendInt(message.daysUntilNextGift());
        packet.appendInt(message.giftsAvailable());
    }
}
