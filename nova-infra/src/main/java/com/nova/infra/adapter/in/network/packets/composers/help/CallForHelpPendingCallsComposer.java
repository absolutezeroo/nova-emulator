package com.nova.infra.adapter.in.network.packets.composers.help;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.help.CallForHelpPendingCallsMessage;

/**
 * Composes CallForHelpPendingCalls packet for client.
 */
public class CallForHelpPendingCallsComposer extends PacketComposer<CallForHelpPendingCallsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CFH_PENDING_CALLS;
    }

    @Override
    protected void write(PacketBuffer packet, CallForHelpPendingCallsMessage message) {
        // No fields to write
    }
}
