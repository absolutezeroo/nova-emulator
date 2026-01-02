package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetSoundSettingsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetSoundSettings packet from client.
 */
@ParsesPacket(Incoming.GET_SOUND_SETTINGS)
public class GetSoundSettingsParser extends PacketParser<GetSoundSettingsMessageEvent> {
@Override
    public GetSoundSettingsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetSoundSettingsMessageEvent();
    }
}
