package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ChatReviewSessionVotingStatusMessage;

/**
 * Composes ChatReviewSessionVotingStatus packet for client.
 */
public class ChatReviewSessionVotingStatusComposer extends PacketComposer<ChatReviewSessionVotingStatusMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CHAT_REVIEW_SESSION_VOTING_STATUS;
    }

    @Override
    protected void write(PacketBuffer packet, ChatReviewSessionVotingStatusMessage message) {
        // No fields to write
    }
}
