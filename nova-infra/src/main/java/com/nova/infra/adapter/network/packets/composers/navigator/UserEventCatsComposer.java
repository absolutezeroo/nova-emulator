package com.nova.infra.adapter.network.packets.composers.navigator;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.navigator.UserEventCatsMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes UserEventCats packet for client.
 */
@ComposesPacket(Outgoing.NAVIGATOR_EVENT_CATEGORIES)
public class UserEventCatsComposer extends PacketComposer<UserEventCatsMessage> {
@Override
    protected void write(PacketBuffer packet, UserEventCatsMessage message) {
        // No fields to write
    }
}
