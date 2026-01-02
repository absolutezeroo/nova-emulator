package com.nova.infra.adapter.in.network.packets.parsers.crafting;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.crafting.CraftSecretMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses CraftSecret packet from client.
 */
@ParsesPacket(Incoming.CRAFT_SECRET)
public class CraftSecretParser extends PacketParser<CraftSecretMessageEvent> {
@Override
    public CraftSecretMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CraftSecretMessageEvent();
    }
}
