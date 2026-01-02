package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.IssueCloseNotificationMessage;

/**
 * Composes IssueCloseNotification packet for client.
 */
public class IssueCloseNotificationComposer extends PacketComposer<IssueCloseNotificationMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ISSUE_CLOSE_NOTIFICATION;
    }

    @Override
    protected void write(PacketBuffer packet, IssueCloseNotificationMessage message) {
        packet.appendInt(message.closeReason());
        packet.appendString(message.messageText());
    }
}
