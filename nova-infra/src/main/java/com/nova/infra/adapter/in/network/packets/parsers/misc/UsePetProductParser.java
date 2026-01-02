package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.UsePetProductMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses UsePetProduct packet from client.
 */
@ParsesPacket(Incoming.USE_PET_PRODUCT)
public class UsePetProductParser extends PacketParser<UsePetProductMessageEvent> {
@Override
    public UsePetProductMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UsePetProductMessageEvent();
    }
}
