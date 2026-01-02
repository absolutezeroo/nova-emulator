package com.nova.infra.adapter.in.network.packets.composers.navigator;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.navigator.UserFlatCatsMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes UserFlatCats packet for client.
 */
@ComposesPacket(Outgoing.NAVIGATOR_CATEGORIES)
public class UserFlatCatsComposer extends PacketComposer<UserFlatCatsMessage> {
@Override
    protected void write(PacketBuffer packet, UserFlatCatsMessage message) {
        // No fields to write
    }
}
