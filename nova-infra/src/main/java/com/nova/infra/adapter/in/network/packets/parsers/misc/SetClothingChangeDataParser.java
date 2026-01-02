package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.SetClothingChangeDataMessageEvent;

/**
 * Parses SetClothingChangeData packet from client.
 */
public class SetClothingChangeDataParser extends PacketParser<SetClothingChangeDataMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.SET_CLOTHING_CHANGE_DATA;
    }

    @Override
    public SetClothingChangeDataMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SetClothingChangeDataMessageEvent();
    }
}
