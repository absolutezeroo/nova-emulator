package com.nova.infra.adapter.in.network.packets.composers.help;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.help.CfhChatlogMessage;

/**
 * Composes CfhChatlog packet for client.
 */
public class CfhChatlogComposer extends PacketComposer<CfhChatlogMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CFH_CHATLOG;
    }

    @Override
    protected void write(PacketBuffer packet, CfhChatlogMessage message) {
        // No fields to write
    }
}
