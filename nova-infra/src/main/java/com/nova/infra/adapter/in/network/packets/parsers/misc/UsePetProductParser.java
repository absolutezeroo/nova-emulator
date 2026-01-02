package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.UsePetProductMessageEvent;

/**
 * Parses UsePetProduct packet from client.
 */
public class UsePetProductParser extends PacketParser<UsePetProductMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.USE_PET_PRODUCT;
    }

    @Override
    public UsePetProductMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UsePetProductMessageEvent();
    }
}
