package com.nova.infra.adapter.in.network.packets.composers.catalog;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.catalog.BuildersClubSubscriptionStatusMessage;

/**
 * Composes BuildersClubSubscriptionStatus packet for client.
 */
public class BuildersClubSubscriptionStatusComposer extends PacketComposer<BuildersClubSubscriptionStatusMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.BUILDERS_CLUB_SUBSCRIPTION;
    }

    @Override
    protected void write(PacketBuffer packet, BuildersClubSubscriptionStatusMessage message) {
        packet.appendInt(message.secondsLeft());
        packet.appendInt(message.furniLimit());
        packet.appendInt(message.maxFurniLimit());
        packet.appendInt(message.secondsLeftWithGrace());
    }
}
