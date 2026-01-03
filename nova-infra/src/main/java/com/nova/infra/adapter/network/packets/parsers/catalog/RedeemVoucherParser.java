package com.nova.infra.adapter.network.packets.parsers.catalog;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.catalog.RedeemVoucherMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RedeemVoucher packet from client.
 */
@ParsesPacket(Incoming.CATALOG_REDEEM_VOUCHER)
public class RedeemVoucherParser extends PacketParser<RedeemVoucherMessageEvent> {
@Override
    public RedeemVoucherMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RedeemVoucherMessageEvent();
    }
}
