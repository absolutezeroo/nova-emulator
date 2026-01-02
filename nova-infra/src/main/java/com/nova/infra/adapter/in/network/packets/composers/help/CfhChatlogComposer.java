package com.nova.infra.adapter.in.network.packets.composers.help;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.help.CfhChatlogMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes CfhChatlog packet for client.
 */
@ComposesPacket(Outgoing.CFH_CHATLOG)
public class CfhChatlogComposer extends PacketComposer<CfhChatlogMessage> {
@Override
    protected void write(PacketBuffer packet, CfhChatlogMessage message) {
        // No fields to write
    }
}
