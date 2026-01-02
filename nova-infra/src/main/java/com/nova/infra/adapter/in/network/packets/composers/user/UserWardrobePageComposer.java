package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.UserWardrobePageMessage;

/**
 * Composes UserWardrobePage packet for client.
 */
public class UserWardrobePageComposer extends PacketComposer<UserWardrobePageMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_WARDROBE_PAGE;
    }

    @Override
    protected void write(PacketBuffer packet, UserWardrobePageMessage message) {
        // No fields to write
    }
}
