package com.nova.infra.adapter.in.network.packets.composers.navigator;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.navigator.UserEventCatsMessage;

/**
 * Composes UserEventCats packet for client.
 */
public class UserEventCatsComposer extends PacketComposer<UserEventCatsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.NAVIGATOR_EVENT_CATEGORIES;
    }

    @Override
    protected void write(PacketBuffer packet, UserEventCatsMessage message) {
        // No fields to write
    }
}
