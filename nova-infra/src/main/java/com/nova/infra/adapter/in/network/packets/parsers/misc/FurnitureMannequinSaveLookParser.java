package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.FurnitureMannequinSaveLookMessageEvent;

/**
 * Parses FurnitureMannequinSaveLook packet from client.
 */
public class FurnitureMannequinSaveLookParser extends PacketParser<FurnitureMannequinSaveLookMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MANNEQUIN_SAVE_LOOK;
    }

    @Override
    public FurnitureMannequinSaveLookMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurnitureMannequinSaveLookMessageEvent();
    }
}
