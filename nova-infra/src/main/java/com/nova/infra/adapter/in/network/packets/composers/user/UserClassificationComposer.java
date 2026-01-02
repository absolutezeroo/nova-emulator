package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.UserClassificationMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes UserClassification packet for client.
 */
@ComposesPacket(Outgoing.USER_CLASSIFICATION)
public class UserClassificationComposer extends PacketComposer<UserClassificationMessage> {
@Override
    protected void write(PacketBuffer packet, UserClassificationMessage message) {
        // No fields to write
    }
}
