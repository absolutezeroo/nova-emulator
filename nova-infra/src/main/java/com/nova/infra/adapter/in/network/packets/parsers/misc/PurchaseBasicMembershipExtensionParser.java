package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.PurchaseBasicMembershipExtensionMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses PurchaseBasicMembershipExtension packet from client.
 */
@ParsesPacket(Incoming.PURCHASE_BASIC_MEMBERSHIP_EXTENSION)
public class PurchaseBasicMembershipExtensionParser extends PacketParser<PurchaseBasicMembershipExtensionMessageEvent> {
@Override
    public PurchaseBasicMembershipExtensionMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PurchaseBasicMembershipExtensionMessageEvent();
    }
}
