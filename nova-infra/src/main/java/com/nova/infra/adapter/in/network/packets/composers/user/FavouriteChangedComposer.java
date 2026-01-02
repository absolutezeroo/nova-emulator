package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.FavouriteChangedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes FavouriteChanged packet for client.
 */
@ComposesPacket(Outgoing.USER_FAVORITE_ROOM)
public class FavouriteChangedComposer extends PacketComposer<FavouriteChangedMessage> {
@Override
    protected void write(PacketBuffer packet, FavouriteChangedMessage message) {
        packet.appendInt(message.flatId());
        packet.appendBoolean(message.added());
    }
}
