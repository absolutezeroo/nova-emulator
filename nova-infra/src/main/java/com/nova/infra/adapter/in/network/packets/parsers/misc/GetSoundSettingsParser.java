package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetSoundSettingsMessageEvent;

/**
 * Parses GetSoundSettings packet from client.
 */
public class GetSoundSettingsParser extends PacketParser<GetSoundSettingsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_SOUND_SETTINGS;
    }

    @Override
    public GetSoundSettingsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetSoundSettingsMessageEvent();
    }
}
