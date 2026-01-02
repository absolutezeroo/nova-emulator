package com.nova.infra.adapter.in.network.packets.parsers.furniture;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.furniture.FurnitureGroupInfoMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses FurnitureGroupInfo packet from client.
 */
@ParsesPacket(Incoming.FURNITURE_GROUP_INFO)
public class FurnitureGroupInfoParser extends PacketParser<FurnitureGroupInfoMessageEvent> {
@Override
    public FurnitureGroupInfoMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurnitureGroupInfoMessageEvent();
    }
}
