package com.nova.infra.adapter.in.network.packets.parsers.recycler;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.recycler.RecycleItemsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses RecycleItems packet from client.
 */
@ParsesPacket(Incoming.RECYCLER_ITEMS)
public class RecycleItemsParser extends PacketParser<RecycleItemsMessageEvent> {
@Override
    public RecycleItemsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RecycleItemsMessageEvent();
    }
}
