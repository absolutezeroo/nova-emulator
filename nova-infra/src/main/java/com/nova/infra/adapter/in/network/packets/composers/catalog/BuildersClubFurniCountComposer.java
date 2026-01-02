package com.nova.infra.adapter.in.network.packets.composers.catalog;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.catalog.BuildersClubFurniCountMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes BuildersClubFurniCount packet for client.
 */
@ComposesPacket(Outgoing.BUILDERS_CLUB_FURNI_COUNT)
public class BuildersClubFurniCountComposer extends PacketComposer<BuildersClubFurniCountMessage> {
@Override
    protected void write(PacketBuffer packet, BuildersClubFurniCountMessage message) {
        packet.appendInt(message.furniCount());
    }
}
