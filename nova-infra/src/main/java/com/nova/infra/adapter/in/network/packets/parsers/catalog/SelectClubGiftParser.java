package com.nova.infra.adapter.in.network.packets.parsers.catalog;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.catalog.SelectClubGiftMessageEvent;

/**
 * Parses SelectClubGift packet from client.
 */
public class SelectClubGiftParser extends PacketParser<SelectClubGiftMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.CATALOG_SELECT_VIP_GIFT;
    }

    @Override
    public SelectClubGiftMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SelectClubGiftMessageEvent();
    }
}
