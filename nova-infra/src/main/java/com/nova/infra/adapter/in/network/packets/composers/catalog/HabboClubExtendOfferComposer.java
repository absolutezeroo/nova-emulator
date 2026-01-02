package com.nova.infra.adapter.in.network.packets.composers.catalog;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.catalog.HabboClubExtendOfferMessage;

/**
 * Composes HabboClubExtendOffer packet for client.
 */
public class HabboClubExtendOfferComposer extends PacketComposer<HabboClubExtendOfferMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CLUB_EXTENDED_OFFER;
    }

    @Override
    protected void write(PacketBuffer packet, HabboClubExtendOfferMessage message) {
        // No fields to write
    }
}
