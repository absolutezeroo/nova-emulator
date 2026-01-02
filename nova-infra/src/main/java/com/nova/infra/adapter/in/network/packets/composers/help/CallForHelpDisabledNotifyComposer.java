package com.nova.infra.adapter.in.network.packets.composers.help;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.help.CallForHelpDisabledNotifyMessage;

/**
 * Composes CallForHelpDisabledNotify packet for client.
 */
public class CallForHelpDisabledNotifyComposer extends PacketComposer<CallForHelpDisabledNotifyMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CFH_DISABLED_NOTIFY;
    }

    @Override
    protected void write(PacketBuffer packet, CallForHelpDisabledNotifyMessage message) {
        packet.appendString(message.infoUrl());
    }
}
