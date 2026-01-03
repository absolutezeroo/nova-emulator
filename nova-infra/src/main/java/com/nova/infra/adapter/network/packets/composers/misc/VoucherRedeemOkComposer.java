package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.VoucherRedeemOkMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes VoucherRedeemOk packet for client.
 */
@ComposesPacket(Outgoing.REDEEM_VOUCHER_OK)
public class VoucherRedeemOkComposer extends PacketComposer<VoucherRedeemOkMessage> {
@Override
    protected void write(PacketBuffer packet, VoucherRedeemOkMessage message) {
        packet.appendString(message.productDescription());
        packet.appendString(message.productName());
    }
}
