package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.RedeemItemClothingMessageEvent;

/**
 * Parses RedeemItemClothing packet from client.
 */
public class RedeemItemClothingParser extends PacketParser<RedeemItemClothingMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ITEM_CLOTHING_REDEEM;
    }

    @Override
    public RedeemItemClothingMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RedeemItemClothingMessageEvent();
    }
}
