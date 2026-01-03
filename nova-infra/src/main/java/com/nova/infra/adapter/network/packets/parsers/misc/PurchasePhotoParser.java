package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.PurchasePhotoMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
