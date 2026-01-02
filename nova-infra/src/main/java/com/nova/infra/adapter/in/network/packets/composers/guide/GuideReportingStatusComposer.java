package com.nova.infra.adapter.in.network.packets.composers.guide;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.guide.GuideReportingStatusMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes GuideReportingStatus packet for client.
 */
@ComposesPacket(Outgoing.GUIDE_REPORTING_STATUS)
public class GuideReportingStatusComposer extends PacketComposer<GuideReportingStatusMessage> {
@Override
    protected void write(PacketBuffer packet, GuideReportingStatusMessage message) {
        packet.appendInt(message.statusCode());
    }
}
