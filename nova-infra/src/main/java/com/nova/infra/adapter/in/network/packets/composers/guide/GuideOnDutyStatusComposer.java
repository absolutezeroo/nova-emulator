package com.nova.infra.adapter.in.network.packets.composers.guide;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.guide.GuideOnDutyStatusMessage;

/**
 * Composes GuideOnDutyStatus packet for client.
 */
public class GuideOnDutyStatusComposer extends PacketComposer<GuideOnDutyStatusMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GUIDE_ON_DUTY_STATUS;
    }

    @Override
    protected void write(PacketBuffer packet, GuideOnDutyStatusMessage message) {
        packet.appendBoolean(message.onDuty());
        packet.appendInt(message.guidesOnDuty());
        packet.appendInt(message.helpersOnDuty());
        packet.appendInt(message.guardiansOnDuty());
    }
}
