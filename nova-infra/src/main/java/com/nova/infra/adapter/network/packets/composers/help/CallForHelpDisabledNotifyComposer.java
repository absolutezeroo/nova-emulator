package com.nova.infra.adapter.network.packets.composers.help;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.help.CallForHelpDisabledNotifyMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
