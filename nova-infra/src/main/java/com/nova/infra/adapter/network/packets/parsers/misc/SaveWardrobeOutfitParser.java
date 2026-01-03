package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.SaveWardrobeOutfitMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses SaveWardrobeOutfit packet from client.
 */
@ParsesPacket(Incoming.SAVE_WARDROBE_OUTFIT)
public class SaveWardrobeOutfitParser extends PacketParser<SaveWardrobeOutfitMessageEvent> {
@Override
    public SaveWardrobeOutfitMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SaveWardrobeOutfitMessageEvent();
    }
}
