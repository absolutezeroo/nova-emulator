package com.nova.infra.adapter.in.network.packets.composers.help;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.help.CallForHelpDisabledNotifyMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes CallForHelpDisabledNotify packet for client.
 */
@ComposesPacket(Outgoing.CFH_DISABLED_NOTIFY)
public class CallForHelpDisabledNotifyComposer extends PacketComposer<CallForHelpDisabledNotifyMessage> {
@Override
    protected void write(PacketBuffer packet, CallForHelpDisabledNotifyMessage message) {
        packet.appendString(message.infoUrl());
    }
}
