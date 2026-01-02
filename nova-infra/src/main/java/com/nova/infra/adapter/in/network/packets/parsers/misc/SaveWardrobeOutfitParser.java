package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.SaveWardrobeOutfitMessageEvent;

/**
 * Parses SaveWardrobeOutfit packet from client.
 */
public class SaveWardrobeOutfitParser extends PacketParser<SaveWardrobeOutfitMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.SAVE_WARDROBE_OUTFIT;
    }

    @Override
    public SaveWardrobeOutfitMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SaveWardrobeOutfitMessageEvent();
    }
}
