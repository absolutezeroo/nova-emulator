package com.nova.infra.adapter.network.packets.composers.user;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.user.FavouritesMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes Favourites packet for client.
 */
@ComposesPacket(Outgoing.USER_FAVORITE_ROOM_COUNT)
public class FavouritesComposer extends PacketComposer<FavouritesMessage> {
@Override
    protected void write(PacketBuffer packet, FavouritesMessage message) {
        packet.appendInt(message.limit());
    }
}
