package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.RemovePetSaddleMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses RemovePetSaddle packet from client.
 */
@ParsesPacket(Incoming.REMOVE_PET_SADDLE)
public class RemovePetSaddleParser extends PacketParser<RemovePetSaddleMessageEvent> {
@Override
    public RemovePetSaddleMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RemovePetSaddleMessageEvent();
    }
}
