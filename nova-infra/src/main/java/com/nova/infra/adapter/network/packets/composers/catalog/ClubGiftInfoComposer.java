package com.nova.infra.adapter.network.packets.composers.catalog;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.catalog.ClubGiftInfoMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
