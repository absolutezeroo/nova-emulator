package com.nova.infra.adapter.in.network.packets.composers.help;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.help.CfhSanctionMessage;

/**
 * Composes CfhSanction packet for client.
 */
public class CfhSanctionComposer extends PacketComposer<CfhSanctionMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CFH_SANCTION;
    }

    @Override
    protected void write(PacketBuffer packet, CfhSanctionMessage message) {
        packet.appendInt(message.issueId());
        packet.appendInt(message.accountId());
    }
}
