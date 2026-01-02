package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.PurchaseVipMembershipExtensionMessageEvent;

/**
 * Parses PurchaseVipMembershipExtension packet from client.
 */
public class PurchaseVipMembershipExtensionParser extends PacketParser<PurchaseVipMembershipExtensionMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.PURCHASE_VIP_MEMBERSHIP_EXTENSION;
    }

    @Override
    public PurchaseVipMembershipExtensionMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PurchaseVipMembershipExtensionMessageEvent();
    }
}
