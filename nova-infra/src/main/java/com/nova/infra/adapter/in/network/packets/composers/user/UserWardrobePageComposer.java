package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.UserWardrobePageMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes UserWardrobePage packet for client.
 */
@ComposesPacket(Outgoing.USER_WARDROBE_PAGE)
public class UserWardrobePageComposer extends PacketComposer<UserWardrobePageMessage> {
@Override
    protected void write(PacketBuffer packet, UserWardrobePageMessage message) {
        // No fields to write
    }
}
