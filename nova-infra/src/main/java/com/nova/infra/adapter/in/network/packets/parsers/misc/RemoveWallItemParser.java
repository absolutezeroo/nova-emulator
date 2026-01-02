package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.RemoveWallItemMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses RemoveWallItem packet from client.
 */
@ParsesPacket(Incoming.REMOVE_WALL_ITEM)
public class RemoveWallItemParser extends PacketParser<RemoveWallItemMessageEvent> {
@Override
    public RemoveWallItemMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RemoveWallItemMessageEvent();
    }
}
