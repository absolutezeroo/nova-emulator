package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetPetCommandsMessageEvent;

/**
 * Parses GetPetCommands packet from client.
 */
public class GetPetCommandsParser extends PacketParser<GetPetCommandsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_PET_TRAINING_PANEL;
    }

    @Override
    public GetPetCommandsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetPetCommandsMessageEvent();
    }
}
