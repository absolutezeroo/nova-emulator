package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.VoucherRedeemErrorMessage;

/**
 * Composes VoucherRedeemError packet for client.
 */
public class VoucherRedeemErrorComposer extends PacketComposer<VoucherRedeemErrorMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.REDEEM_VOUCHER_ERROR;
    }

    @Override
    protected void write(PacketBuffer packet, VoucherRedeemErrorMessage message) {
        packet.appendString(message.errorCode());
    }
}
