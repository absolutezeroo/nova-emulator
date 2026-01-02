package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.EmailStatusResultMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes EmailStatusResult packet for client.
 */
@ComposesPacket(Outgoing.EMAIL_STATUS)
public class EmailStatusResultComposer extends PacketComposer<EmailStatusResultMessage> {
@Override
    protected void write(PacketBuffer packet, EmailStatusResultMessage message) {
        // No fields to write
    }
}
