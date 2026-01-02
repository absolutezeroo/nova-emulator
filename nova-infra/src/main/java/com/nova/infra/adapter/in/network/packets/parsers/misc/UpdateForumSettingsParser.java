package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.UpdateForumSettingsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses UpdateForumSettings packet from client.
 */
@ParsesPacket(Incoming.UPDATE_FORUM_SETTINGS)
public class UpdateForumSettingsParser extends PacketParser<UpdateForumSettingsMessageEvent> {
@Override
    public UpdateForumSettingsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UpdateForumSettingsMessageEvent();
    }
}
