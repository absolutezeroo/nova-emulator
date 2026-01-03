package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.FavoriteMembershipUpdateMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes FavoriteMembershipUpdate packet for client.
 */
@ComposesPacket(Outgoing.FAVORITE_GROUP_UDPATE)
public class FavoriteMembershipUpdateComposer extends PacketComposer<FavoriteMembershipUpdateMessage> {
@Override
    protected void write(PacketBuffer packet, FavoriteMembershipUpdateMessage message) {
        packet.appendInt(message.roomIndex());
        packet.appendInt(message.groupId());
        packet.appendInt(message.status());
        packet.appendString(message.groupName());
    }
}
