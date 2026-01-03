package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.FurnitureMannequinSaveLookMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses FurnitureMannequinSaveLook packet from client.
 */
@ParsesPacket(Incoming.MANNEQUIN_SAVE_LOOK)
public class FurnitureMannequinSaveLookParser extends PacketParser<FurnitureMannequinSaveLookMessageEvent> {
@Override
    public FurnitureMannequinSaveLookMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurnitureMannequinSaveLookMessageEvent();
    }
}
