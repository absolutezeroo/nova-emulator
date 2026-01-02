package com.nova.infra.adapter.in.network.packets.parsers.guide;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.guide.GuideSessionInviteRequesterMessageEvent;

/**
 * Parses GuideSessionInviteRequester packet from client.
 */
public class GuideSessionInviteRequesterParser extends PacketParser<GuideSessionInviteRequesterMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GUIDE_SESSION_INVITE_REQUESTER;
    }

    @Override
    public GuideSessionInviteRequesterMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GuideSessionInviteRequesterMessageEvent();
    }
}
