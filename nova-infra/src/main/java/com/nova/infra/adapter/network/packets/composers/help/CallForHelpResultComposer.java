package com.nova.infra.adapter.network.packets.composers.help;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.help.CallForHelpResultMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes CallForHelpResult packet for client.
 */
@ComposesPacket(Outgoing.CFH_RESULT_MESSAGE)
public class CallForHelpResultComposer extends PacketComposer<CallForHelpResultMessage> {
@Override
    protected void write(PacketBuffer packet, CallForHelpResultMessage message) {
        packet.appendInt(message.resultType());
        packet.appendString(message.messageText());
    }
}
