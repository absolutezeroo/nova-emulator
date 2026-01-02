package com.nova.infra.adapter.in.network.packets.composers.navigator;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.navigator.UserFlatCatsMessage;

/**
 * Composes UserFlatCats packet for client.
 */
public class UserFlatCatsComposer extends PacketComposer<UserFlatCatsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.NAVIGATOR_CATEGORIES;
    }

    @Override
    protected void write(PacketBuffer packet, UserFlatCatsMessage message) {
        // No fields to write
    }
}
