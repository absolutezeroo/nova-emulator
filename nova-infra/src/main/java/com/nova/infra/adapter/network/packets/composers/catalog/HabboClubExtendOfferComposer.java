package com.nova.infra.adapter.network.packets.composers.catalog;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.catalog.HabboClubExtendOfferMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes HabboClubExtendOffer packet for client.
 */
@ComposesPacket(Outgoing.CLUB_EXTENDED_OFFER)
public class HabboClubExtendOfferComposer extends PacketComposer<HabboClubExtendOfferMessage> {
@Override
    protected void write(PacketBuffer packet, HabboClubExtendOfferMessage message) {
        // No fields to write
    }
}
