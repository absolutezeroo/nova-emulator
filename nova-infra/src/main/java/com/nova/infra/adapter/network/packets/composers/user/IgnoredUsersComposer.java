package com.nova.infra.adapter.network.packets.composers.user;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.user.IgnoredUsersMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes IgnoredUsers packet for client.
 */
@ComposesPacket(Outgoing.USER_IGNORED)
public class IgnoredUsersComposer extends PacketComposer<IgnoredUsersMessage> {
@Override
    protected void write(PacketBuffer packet, IgnoredUsersMessage message) {
        // No fields to write
    }
}
