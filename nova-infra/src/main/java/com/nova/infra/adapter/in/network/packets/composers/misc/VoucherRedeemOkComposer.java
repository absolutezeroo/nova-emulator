package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.VoucherRedeemOkMessage;

/**
 * Composes VoucherRedeemOk packet for client.
 */
public class VoucherRedeemOkComposer extends PacketComposer<VoucherRedeemOkMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.REDEEM_VOUCHER_OK;
    }

    @Override
    protected void write(PacketBuffer packet, VoucherRedeemOkMessage message) {
        packet.appendString(message.productDescription());
        packet.appendString(message.productName());
    }
}
