package com.nova.infra.adapter.network.packets.composers.catalog;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.catalog.ClubGiftNotificationMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes ClubGiftNotification packet for client.
 */
@ComposesPacket(Outgoing.CLUB_GIFT_NOTIFICATION)
public class ClubGiftNotificationComposer extends PacketComposer<ClubGiftNotificationMessage> {
@Override
    protected void write(PacketBuffer packet, ClubGiftNotificationMessage message) {
        packet.appendInt(message.numGifts());
    }
}
