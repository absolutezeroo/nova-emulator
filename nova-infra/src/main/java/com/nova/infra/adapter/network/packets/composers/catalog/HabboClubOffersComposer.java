package com.nova.infra.adapter.network.packets.composers.catalog;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.catalog.HabboClubOffersMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes HabboClubOffers packet for client.
 */
@ComposesPacket(Outgoing.CLUB_OFFERS)
public class HabboClubOffersComposer extends PacketComposer<HabboClubOffersMessage> {
@Override
    protected void write(PacketBuffer packet, HabboClubOffersMessage message) {
        // No fields to write
    }
}
