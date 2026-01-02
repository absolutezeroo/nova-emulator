package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.UpdateForumSettingsMessageEvent;

/**
 * Parses UpdateForumSettings packet from client.
 */
public class UpdateForumSettingsParser extends PacketParser<UpdateForumSettingsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.UPDATE_FORUM_SETTINGS;
    }

    @Override
    public UpdateForumSettingsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UpdateForumSettingsMessageEvent();
    }
}
