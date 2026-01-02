package com.nova.infra.adapter.in.network.packets.composers.guide;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.guide.GuideOnDutyStatusMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes GuideOnDutyStatus packet for client.
 */
@ComposesPacket(Outgoing.GUIDE_ON_DUTY_STATUS)
public class GuideOnDutyStatusComposer extends PacketComposer<GuideOnDutyStatusMessage> {
@Override
    protected void write(PacketBuffer packet, GuideOnDutyStatusMessage message) {
        packet.appendBoolean(message.onDuty());
        packet.appendInt(message.guidesOnDuty());
        packet.appendInt(message.helpersOnDuty());
        packet.appendInt(message.guardiansOnDuty());
    }
}
