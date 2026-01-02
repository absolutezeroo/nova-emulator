package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.SetClothingChangeDataMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses SetClothingChangeData packet from client.
 */
@ParsesPacket(Incoming.SET_CLOTHING_CHANGE_DATA)
public class SetClothingChangeDataParser extends PacketParser<SetClothingChangeDataMessageEvent> {
@Override
    public SetClothingChangeDataMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SetClothingChangeDataMessageEvent();
    }
}
