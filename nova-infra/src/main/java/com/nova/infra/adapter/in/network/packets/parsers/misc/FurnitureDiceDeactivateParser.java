package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.FurnitureDiceDeactivateMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses FurnitureDiceDeactivate packet from client.
 */
@ParsesPacket(Incoming.ITEM_DICE_CLOSE)
public class FurnitureDiceDeactivateParser extends PacketParser<FurnitureDiceDeactivateMessageEvent> {
@Override
    public FurnitureDiceDeactivateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurnitureDiceDeactivateMessageEvent();
    }
}
