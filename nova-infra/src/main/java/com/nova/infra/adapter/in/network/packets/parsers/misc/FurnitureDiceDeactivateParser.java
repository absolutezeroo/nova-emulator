package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.FurnitureDiceDeactivateMessageEvent;

/**
 * Parses FurnitureDiceDeactivate packet from client.
 */
public class FurnitureDiceDeactivateParser extends PacketParser<FurnitureDiceDeactivateMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ITEM_DICE_CLOSE;
    }

    @Override
    public FurnitureDiceDeactivateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurnitureDiceDeactivateMessageEvent();
    }
}
