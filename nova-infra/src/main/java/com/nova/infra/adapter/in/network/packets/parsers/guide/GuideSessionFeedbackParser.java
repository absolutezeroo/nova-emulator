package com.nova.infra.adapter.in.network.packets.parsers.guide;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.guide.GuideSessionFeedbackMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GuideSessionFeedback packet from client.
 */
@ParsesPacket(Incoming.GUIDE_SESSION_FEEDBACK)
public class GuideSessionFeedbackParser extends PacketParser<GuideSessionFeedbackMessageEvent> {
@Override
    public GuideSessionFeedbackMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GuideSessionFeedbackMessageEvent();
    }
}
