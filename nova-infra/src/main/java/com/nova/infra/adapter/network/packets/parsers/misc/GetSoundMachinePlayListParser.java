package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetSoundMachinePlayListMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetSoundMachinePlayList packet from client.
 */
@ParsesPacket(Incoming.GET_SOUND_MACHINE_PLAYLIST)
public class GetSoundMachinePlayListParser extends PacketParser<GetSoundMachinePlayListMessageEvent> {
@Override
    public GetSoundMachinePlayListMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetSoundMachinePlayListMessageEvent();
    }
}
