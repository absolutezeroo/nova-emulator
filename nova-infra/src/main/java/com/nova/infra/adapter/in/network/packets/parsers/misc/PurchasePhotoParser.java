package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.PurchasePhotoMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses PurchasePhoto packet from client.
 */
@ParsesPacket(Incoming.PURCHASE_PHOTO)
public class PurchasePhotoParser extends PacketParser<PurchasePhotoMessageEvent> {
@Override
    public PurchasePhotoMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PurchasePhotoMessageEvent();
    }
}
