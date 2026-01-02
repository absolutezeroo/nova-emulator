package com.nova.infra.adapter.in.network.packets.composers.help;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.help.CfhSanctionMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes CfhSanction packet for client.
 */
@ComposesPacket(Outgoing.CFH_SANCTION)
public class CfhSanctionComposer extends PacketComposer<CfhSanctionMessage> {
@Override
    protected void write(PacketBuffer packet, CfhSanctionMessage message) {
        packet.appendInt(message.issueId());
        packet.appendInt(message.accountId());
    }
}
