package com.nova.infra.adapter.in.network.packets.composers.help;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.help.CallForHelpResultMessage;

/**
 * Composes CallForHelpResult packet for client.
 */
public class CallForHelpResultComposer extends PacketComposer<CallForHelpResultMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CFH_RESULT_MESSAGE;
    }

    @Override
    protected void write(PacketBuffer packet, CallForHelpResultMessage message) {
        packet.appendInt(message.resultType());
        packet.appendString(message.messageText());
    }
}
