package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.FurnitureMannequinSaveNameMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses FurnitureMannequinSaveName packet from client.
 */
@ParsesPacket(Incoming.MANNEQUIN_SAVE_NAME)
public class FurnitureMannequinSaveNameParser extends PacketParser<FurnitureMannequinSaveNameMessageEvent> {
@Override
    public FurnitureMannequinSaveNameMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurnitureMannequinSaveNameMessageEvent();
    }
}
