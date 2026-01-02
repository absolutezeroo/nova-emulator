package com.nova.infra.adapter.in.network.packets.composers.help;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.help.CallForHelpPendingCallsDeletedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes CallForHelpPendingCallsDeleted packet for client.
 */
@ComposesPacket(Outgoing.CFH_PENDING_CALLS_DELETED)
public class CallForHelpPendingCallsDeletedComposer extends PacketComposer<CallForHelpPendingCallsDeletedMessage> {
@Override
    protected void write(PacketBuffer packet, CallForHelpPendingCallsDeletedMessage message) {
        // No fields to write
    }
}
