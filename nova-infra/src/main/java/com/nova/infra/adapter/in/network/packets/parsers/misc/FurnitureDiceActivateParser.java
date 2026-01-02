package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.FurnitureDiceActivateMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses FurnitureDiceActivate packet from client.
 */
@ParsesPacket(Incoming.ITEM_DICE_CLICK)
public class FurnitureDiceActivateParser extends PacketParser<FurnitureDiceActivateMessageEvent> {
@Override
    public FurnitureDiceActivateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurnitureDiceActivateMessageEvent();
    }
}
