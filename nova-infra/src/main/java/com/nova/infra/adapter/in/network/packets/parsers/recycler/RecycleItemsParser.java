package com.nova.infra.adapter.in.network.packets.parsers.recycler;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.recycler.RecycleItemsMessageEvent;

/**
 * Parses RecycleItems packet from client.
 */
public class RecycleItemsParser extends PacketParser<RecycleItemsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.RECYCLER_ITEMS;
    }

    @Override
    public RecycleItemsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RecycleItemsMessageEvent();
    }
}
