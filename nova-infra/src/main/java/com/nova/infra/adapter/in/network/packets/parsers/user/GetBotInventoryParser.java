package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.GetBotInventoryMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetBotInventory packet from client.
 */
@ParsesPacket(Incoming.USER_BOTS)
public class GetBotInventoryParser extends PacketParser<GetBotInventoryMessageEvent> {
@Override
    public GetBotInventoryMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetBotInventoryMessageEvent();
    }
}
