package com.nova.infra.adapter.network.packets.composers.help;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.help.SanctionStatusMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes SanctionStatus packet for client.
 */
@ComposesPacket(Outgoing.CFH_SANCTION_STATUS)
public class SanctionStatusComposer extends PacketComposer<SanctionStatusMessage> {
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
