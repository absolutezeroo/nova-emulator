package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.UserSubscriptionMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes UserSubscription packet for client.
 */
@ComposesPacket(Outgoing.USER_SUBSCRIPTION)
public class UserSubscriptionComposer extends PacketComposer<UserSubscriptionMessage> {
@Override
    protected void write(PacketBuffer packet, UserSubscriptionMessage message) {
        packet.appendString(message.productName());
        packet.appendInt(message.daysToPeriodEnd());
        packet.appendInt(message.memberPeriods());
        packet.appendInt(message.periodsSubscribedAhead());
        packet.appendInt(message.responseType());
        packet.appendBoolean(message.hasEverBeenMember());
        packet.appendBoolean(message.isVip());
        packet.appendInt(message.pastClubDays());
        packet.appendInt(message.pastVipDays());
        packet.appendInt(message.minutesUntilExpiration());
        packet.appendInt(message.minutesSinceLastModified());
    }
}
