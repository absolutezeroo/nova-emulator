package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.EmailStatusResultMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
