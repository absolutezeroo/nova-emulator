package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.TryPhoneNumberResultMessage;

/**
 * Composes TryPhoneNumberResult packet for client.
 */
public class TryPhoneNumberResultComposer extends PacketComposer<TryPhoneNumberResultMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.PHONE_TRY_NUMBER_RESULT;
    }

    @Override
    protected void write(PacketBuffer packet, TryPhoneNumberResultMessage message) {
        packet.appendInt(message.resultCode());
        packet.appendInt(message.millisToAllowProcessReset());
    }
}
