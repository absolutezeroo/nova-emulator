package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.FavouriteChangedMessage;

/**
 * Composes FavouriteChanged packet for client.
 */
public class FavouriteChangedComposer extends PacketComposer<FavouriteChangedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_FAVORITE_ROOM;
    }

    @Override
    protected void write(PacketBuffer packet, FavouriteChangedMessage message) {
        packet.appendInt(message.flatId());
        packet.appendBoolean(message.added());
    }
}
