package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.IssueCloseNotificationMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes IssueCloseNotification packet for client.
 */
@ComposesPacket(Outgoing.ISSUE_CLOSE_NOTIFICATION)
public class IssueCloseNotificationComposer extends PacketComposer<IssueCloseNotificationMessage> {
@Override
    protected void write(PacketBuffer packet, IssueCloseNotificationMessage message) {
        packet.appendInt(message.closeReason());
        packet.appendString(message.messageText());
    }
}
