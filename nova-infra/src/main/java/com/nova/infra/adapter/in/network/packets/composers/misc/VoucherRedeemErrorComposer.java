package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.VoucherRedeemErrorMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes VoucherRedeemError packet for client.
 */
@ComposesPacket(Outgoing.REDEEM_VOUCHER_ERROR)
public class VoucherRedeemErrorComposer extends PacketComposer<VoucherRedeemErrorMessage> {
@Override
    protected void write(PacketBuffer packet, VoucherRedeemErrorMessage message) {
        packet.appendString(message.errorCode());
    }
}
