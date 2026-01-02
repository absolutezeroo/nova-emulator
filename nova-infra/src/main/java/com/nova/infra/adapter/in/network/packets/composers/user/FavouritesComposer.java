package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.FavouritesMessage;

/**
 * Composes Favourites packet for client.
 */
public class FavouritesComposer extends PacketComposer<FavouritesMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_FAVORITE_ROOM_COUNT;
    }

    @Override
    protected void write(PacketBuffer packet, FavouritesMessage message) {
        packet.appendInt(message.limit());
    }
}
