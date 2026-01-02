package com.nova.infra.adapter.in.network.packets.composers.help;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.help.CallForHelpPendingCallsMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes CallForHelpPendingCalls packet for client.
 */
@ComposesPacket(Outgoing.CFH_PENDING_CALLS)
public class CallForHelpPendingCallsComposer extends PacketComposer<CallForHelpPendingCallsMessage> {
@Override
    protected void write(PacketBuffer packet, CallForHelpPendingCallsMessage message) {
        // No fields to write
    }
}
