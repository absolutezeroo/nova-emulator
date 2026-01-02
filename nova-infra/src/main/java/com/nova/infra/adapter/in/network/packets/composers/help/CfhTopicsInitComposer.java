package com.nova.infra.adapter.in.network.packets.composers.help;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.help.CfhTopicsInitMessage;

/**
 * Composes CfhTopicsInit packet for client.
 */
public class CfhTopicsInitComposer extends PacketComposer<CfhTopicsInitMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CFH_TOPICS;
    }

    @Override
    protected void write(PacketBuffer packet, CfhTopicsInitMessage message) {
        // No fields to write
    }
}
