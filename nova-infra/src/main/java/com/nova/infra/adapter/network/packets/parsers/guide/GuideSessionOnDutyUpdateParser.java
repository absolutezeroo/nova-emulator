package com.nova.infra.adapter.network.packets.parsers.guide;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.guide.GuideSessionOnDutyUpdateMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GuideSessionOnDutyUpdate packet from client.
 */
@ParsesPacket(Incoming.GUIDE_SESSION_ON_DUTY_UPDATE)
public class GuideSessionOnDutyUpdateParser extends PacketParser<GuideSessionOnDutyUpdateMessageEvent> {
@Override
    public GuideSessionOnDutyUpdateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GuideSessionOnDutyUpdateMessageEvent();
    }
}
