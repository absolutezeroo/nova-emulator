package com.nova.infra.adapter.in.network.packets.parsers.furniture;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.furniture.AddSpamWallPostItMessageEvent;

/**
 * Parses AddSpamWallPostIt packet from client.
 */
public class AddSpamWallPostItParser extends PacketParser<AddSpamWallPostItMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.FURNITURE_POSTIT_SAVE_STICKY_POLE;
    }

    @Override
    public AddSpamWallPostItMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new AddSpamWallPostItMessageEvent();
    }
}
