package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.PurchaseVipMembershipExtensionMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses PurchaseVipMembershipExtension packet from client.
 */
@ParsesPacket(Incoming.PURCHASE_VIP_MEMBERSHIP_EXTENSION)
public class PurchaseVipMembershipExtensionParser extends PacketParser<PurchaseVipMembershipExtensionMessageEvent> {
@Override
    public PurchaseVipMembershipExtensionMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PurchaseVipMembershipExtensionMessageEvent();
    }
}
