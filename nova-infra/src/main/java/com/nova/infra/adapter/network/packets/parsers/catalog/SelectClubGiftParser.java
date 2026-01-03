package com.nova.infra.adapter.network.packets.parsers.catalog;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.catalog.SelectClubGiftMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
