package com.nova.infra.adapter.in.network.packets.parsers.guide;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.guide.GuideSessionOnDutyUpdateMessageEvent;

/**
 * Parses GuideSessionOnDutyUpdate packet from client.
 */
public class GuideSessionOnDutyUpdateParser extends PacketParser<GuideSessionOnDutyUpdateMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GUIDE_SESSION_ON_DUTY_UPDATE;
    }

    @Override
    public GuideSessionOnDutyUpdateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GuideSessionOnDutyUpdateMessageEvent();
    }
}
