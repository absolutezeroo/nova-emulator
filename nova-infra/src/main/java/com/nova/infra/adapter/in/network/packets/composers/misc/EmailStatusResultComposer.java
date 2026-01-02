package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.EmailStatusResultMessage;

/**
 * Composes EmailStatusResult packet for client.
 */
public class EmailStatusResultComposer extends PacketComposer<EmailStatusResultMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.EMAIL_STATUS;
    }

    @Override
    protected void write(PacketBuffer packet, EmailStatusResultMessage message) {
        // No fields to write
    }
}
