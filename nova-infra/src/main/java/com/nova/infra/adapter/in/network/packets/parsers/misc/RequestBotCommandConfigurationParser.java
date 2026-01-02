package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.RequestBotCommandConfigurationMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses RequestBotCommandConfiguration packet from client.
 */
@ParsesPacket(Incoming.BOT_CONFIGURATION)
public class RequestBotCommandConfigurationParser extends PacketParser<RequestBotCommandConfigurationMessageEvent> {
@Override
    public RequestBotCommandConfigurationMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RequestBotCommandConfigurationMessageEvent();
    }
}
