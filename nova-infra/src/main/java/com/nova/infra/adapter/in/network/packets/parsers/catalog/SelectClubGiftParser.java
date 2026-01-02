package com.nova.infra.adapter.in.network.packets.parsers.catalog;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.catalog.SelectClubGiftMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses SelectClubGift packet from client.
 */
@ParsesPacket(Incoming.CATALOG_SELECT_VIP_GIFT)
public class SelectClubGiftParser extends PacketParser<SelectClubGiftMessageEvent> {
@Override
    public SelectClubGiftMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SelectClubGiftMessageEvent();
    }
}
