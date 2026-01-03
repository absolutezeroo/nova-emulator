package com.nova.infra.adapter.network.packets.parsers.furniture;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.furniture.AddSpamWallPostItMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses AddSpamWallPostIt packet from client.
 */
@ParsesPacket(Incoming.FURNITURE_POSTIT_SAVE_STICKY_POLE)
public class AddSpamWallPostItParser extends PacketParser<AddSpamWallPostItMessageEvent> {
@Override
    public AddSpamWallPostItMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new AddSpamWallPostItMessageEvent();
    }
}
