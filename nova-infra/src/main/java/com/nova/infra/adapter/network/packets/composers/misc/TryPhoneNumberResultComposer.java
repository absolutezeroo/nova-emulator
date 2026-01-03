package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.TryPhoneNumberResultMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes TryPhoneNumberResult packet for client.
 */
@ComposesPacket(Outgoing.PHONE_TRY_NUMBER_RESULT)
public class TryPhoneNumberResultComposer extends PacketComposer<TryPhoneNumberResultMessage> {
@Override
    protected void write(PacketBuffer packet, TryPhoneNumberResultMessage message) {
        packet.appendInt(message.resultCode());
        packet.appendInt(message.millisToAllowProcessReset());
    }
}
