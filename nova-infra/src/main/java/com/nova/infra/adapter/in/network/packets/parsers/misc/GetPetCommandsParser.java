package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetPetCommandsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetPetCommands packet from client.
 */
@ParsesPacket(Incoming.GET_PET_TRAINING_PANEL)
public class GetPetCommandsParser extends PacketParser<GetPetCommandsMessageEvent> {
@Override
    public GetPetCommandsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetPetCommandsMessageEvent();
    }
}
