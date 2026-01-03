package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.RedeemItemClothingMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RedeemItemClothing packet from client.
 */
@ParsesPacket(Incoming.ITEM_CLOTHING_REDEEM)
public class RedeemItemClothingParser extends PacketParser<RedeemItemClothingMessageEvent> {
@Override
    public RedeemItemClothingMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RedeemItemClothingMessageEvent();
    }
}
