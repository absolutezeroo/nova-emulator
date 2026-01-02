package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.IgnoredUsersMessage;

/**
 * Composes IgnoredUsers packet for client.
 */
public class IgnoredUsersComposer extends PacketComposer<IgnoredUsersMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_IGNORED;
    }

    @Override
    protected void write(PacketBuffer packet, IgnoredUsersMessage message) {
        // No fields to write
    }
}
