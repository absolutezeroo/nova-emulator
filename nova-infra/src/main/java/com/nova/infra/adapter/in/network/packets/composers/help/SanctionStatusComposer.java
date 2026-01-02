package com.nova.infra.adapter.in.network.packets.composers.help;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.help.SanctionStatusMessage;

/**
 * Composes SanctionStatus packet for client.
 */
public class SanctionStatusComposer extends PacketComposer<SanctionStatusMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CFH_SANCTION_STATUS;
    }

    @Override
    protected void write(PacketBuffer packet, SanctionStatusMessage message) {
        packet.appendBoolean(message.isSanctionNew());
        packet.appendBoolean(message.isSanctionActive());
        packet.appendString(message.sanctionName());
        packet.appendInt(message.sanctionLengthHours());
        packet.appendString(message.sanctionReason());
        packet.appendString(message.sanctionCreationTime());
        packet.appendInt(message.probationHoursLeft());
        packet.appendString(message.nextSanctionName());
        packet.appendInt(message.nextSanctionLengthHours());
        packet.appendBoolean(message.hasCustomMute());
        packet.appendString(message.tradeLockExpiryTime());
    }
}
