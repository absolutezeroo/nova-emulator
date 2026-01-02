package com.nova.infra.adapter.in.network.packets.composers.help;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.help.CallForHelpReplyMessage;

/**
 * Composes CallForHelpReply packet for client.
 */
public class CallForHelpReplyComposer extends PacketComposer<CallForHelpReplyMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CFH_REPLY;
    }

    @Override
    protected void write(PacketBuffer packet, CallForHelpReplyMessage message) {
        // No fields to write
    }
}
