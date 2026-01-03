package com.nova.infra.adapter.network.packets.composers.help;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.help.CallForHelpReplyMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes CallForHelpReply packet for client.
 */
@ComposesPacket(Outgoing.CFH_REPLY)
public class CallForHelpReplyComposer extends PacketComposer<CallForHelpReplyMessage> {
@Override
    protected void write(PacketBuffer packet, CallForHelpReplyMessage message) {
        // No fields to write
    }
}
