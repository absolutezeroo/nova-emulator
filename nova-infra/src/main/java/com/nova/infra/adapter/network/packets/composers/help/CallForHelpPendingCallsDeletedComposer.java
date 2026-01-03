package com.nova.infra.adapter.network.packets.composers.help;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.help.CallForHelpPendingCallsDeletedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
