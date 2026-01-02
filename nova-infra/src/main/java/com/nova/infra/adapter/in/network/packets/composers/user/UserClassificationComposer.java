package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.UserClassificationMessage;

/**
 * Composes UserClassification packet for client.
 */
public class UserClassificationComposer extends PacketComposer<UserClassificationMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_CLASSIFICATION;
    }

    @Override
    protected void write(PacketBuffer packet, UserClassificationMessage message) {
        // No fields to write
    }
}
