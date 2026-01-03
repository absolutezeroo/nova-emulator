package com.nova.infra.adapter.network.packets.composers.help;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.help.CfhTopicsInitMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes CfhTopicsInit packet for client.
 */
@ComposesPacket(Outgoing.CFH_TOPICS)
public class CfhTopicsInitComposer extends PacketComposer<CfhTopicsInitMessage> {
@Override
    protected void write(PacketBuffer packet, CfhTopicsInitMessage message) {
        // No fields to write
    }
}
