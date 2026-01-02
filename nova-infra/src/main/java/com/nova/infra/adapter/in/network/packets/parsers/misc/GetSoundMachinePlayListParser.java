package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetSoundMachinePlayListMessageEvent;

/**
 * Parses GetSoundMachinePlayList packet from client.
 */
public class GetSoundMachinePlayListParser extends PacketParser<GetSoundMachinePlayListMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_SOUND_MACHINE_PLAYLIST;
    }

    @Override
    public GetSoundMachinePlayListMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetSoundMachinePlayListMessageEvent();
    }
}
