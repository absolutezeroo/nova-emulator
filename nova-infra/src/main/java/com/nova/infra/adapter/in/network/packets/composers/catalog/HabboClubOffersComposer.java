package com.nova.infra.adapter.in.network.packets.composers.catalog;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.catalog.HabboClubOffersMessage;

/**
 * Composes HabboClubOffers packet for client.
 */
public class HabboClubOffersComposer extends PacketComposer<HabboClubOffersMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CLUB_OFFERS;
    }

    @Override
    protected void write(PacketBuffer packet, HabboClubOffersMessage message) {
        // No fields to write
    }
}
