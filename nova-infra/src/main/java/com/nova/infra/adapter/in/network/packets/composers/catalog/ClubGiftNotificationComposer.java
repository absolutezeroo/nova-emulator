package com.nova.infra.adapter.in.network.packets.composers.catalog;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.catalog.ClubGiftNotificationMessage;

/**
 * Composes ClubGiftNotification packet for client.
 */
public class ClubGiftNotificationComposer extends PacketComposer<ClubGiftNotificationMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CLUB_GIFT_NOTIFICATION;
    }

    @Override
    protected void write(PacketBuffer packet, ClubGiftNotificationMessage message) {
        packet.appendInt(message.numGifts());
    }
}
