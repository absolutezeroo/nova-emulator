package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.TryVerificationCodeResultMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes TryVerificationCodeResult packet for client.
 */
@ComposesPacket(Outgoing.PHONE_TRY_VERIFICATION_CODE_RESULT)
public class TryVerificationCodeResultComposer extends PacketComposer<TryVerificationCodeResultMessage> {
@Override
    protected void write(PacketBuffer packet, TryVerificationCodeResultMessage message) {
        packet.appendInt(message.resultCode());
        packet.appendInt(message.millisecondsToAllowProcessReset());
    }
}
