package com.nova.infra.adapter.in.network.packets.composers.help;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.help.CallForHelpPendingCallsDeletedMessage;

/**
 * Composes CallForHelpPendingCallsDeleted packet for client.
 */
public class CallForHelpPendingCallsDeletedComposer extends PacketComposer<CallForHelpPendingCallsDeletedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CFH_PENDING_CALLS_DELETED;
    }

    @Override
    protected void write(PacketBuffer packet, CallForHelpPendingCallsDeletedMessage message) {
        // No fields to write
    }
}
