package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.FavoriteMembershipUpdateMessage;

/**
 * Composes FavoriteMembershipUpdate packet for client.
 */
public class FavoriteMembershipUpdateComposer extends PacketComposer<FavoriteMembershipUpdateMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.FAVORITE_GROUP_UDPATE;
    }

    @Override
    protected void write(PacketBuffer packet, FavoriteMembershipUpdateMessage message) {
        packet.appendInt(message.roomIndex());
        packet.appendInt(message.groupId());
        packet.appendInt(message.status());
        packet.appendString(message.groupName());
    }
}
