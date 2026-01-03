package com.nova.infra.adapter.in.network.packets.handlers.handshake;

import jakarta.inject.Inject;
import com.nova.core.application.command.AuthenticateCommand;
import com.nova.core.application.result.AuthenticationResult;
import com.nova.core.domain.model.User;
import com.nova.core.domain.port.in.user.UserUseCase;
import com.nova.core.domain.port.out.network.NetworkConnection;
import com.nova.infra.adapter.in.network.packets.annotations.HandlesPacket;
import com.nova.infra.adapter.in.network.packets.composers.PacketComposerManager;
import com.nova.infra.adapter.in.network.packets.handlers.PacketHandler;
import com.nova.infra.adapter.in.network.packets.incoming.handshake.SSOTicketMessageEvent;
import com.nova.infra.adapter.in.network.packets.outgoing.handshake.AuthenticatedMessage;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.FriendListFragmentMessage;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.MessengerInitMessage;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.AvailabilityStatusMessage;
import com.nova.infra.adapter.in.network.packets.outgoing.navigator.NavigatorSettingsMessage;
import com.nova.infra.adapter.in.network.packets.outgoing.user.AvatarEffectsMessage;
import com.nova.infra.adapter.in.network.packets.outgoing.user.NavigatorHomeRoomMessage;
import com.nova.infra.adapter.in.network.packets.outgoing.user.UserCreditsMessage;
import com.nova.infra.adapter.in.network.packets.outgoing.user.UserCurrencyMessage;
import com.nova.infra.adapter.in.network.packets.outgoing.user.UserInfoMessage;
import com.nova.infra.adapter.in.network.packets.outgoing.user.UserPermissionsMessage;
import com.nova.infra.adapter.in.network.packets.outgoing.user.UserSubscriptionMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Handles SSO ticket authentication requests.
 * <p>
 * Bridges the network layer to the domain layer:
 * 1. Receives parsed SsoTicketMessageEvent from the parser
 * 2. Creates an AuthenticateCommand for the domain
 * 3. Invokes the UserUseCase
 * 4. Sends appropriate response messages to the client
 * <p>
 * Following Hexagonal Architecture, this handler is the adapter that
 * translates between infrastructure (packets) and domain (use cases).
 */
@HandlesPacket(SSOTicketMessageEvent.class)
public class SsoTicketHandler implements PacketHandler<SSOTicketMessageEvent> {

    private static final Logger LOGGER = LoggerFactory.getLogger(SsoTicketHandler.class);

    private final UserUseCase userUseCase;
    private final PacketComposerManager composerManager;

    @Inject
    public SsoTicketHandler(UserUseCase userUseCase, PacketComposerManager composerManager) {
        this.userUseCase = userUseCase;
        this.composerManager = composerManager;
    }

    @Override
    public void handle(NetworkConnection connection, SSOTicketMessageEvent packet) {
        LOGGER.debug("SSO login attempt from {} with ticket length {}",
                connection.getIpAddress(), packet.ssoTicket().length());

        // Create domain command
        AuthenticateCommand command = new AuthenticateCommand(packet.ssoTicket());

        // Invoke a domain use case
        AuthenticationResult result = userUseCase.authenticate(command);

        // Handle result using pattern matching (Java 21)
        switch (result) {
            case AuthenticationResult.Success success -> onSuccess(connection, success.user());
            case AuthenticationResult.Failure failure -> onFailure(connection, failure.reason());
        }
    }

    private void onSuccess(NetworkConnection connection, User user) {
        LOGGER.info("User {} authenticated successfully from {}",
                user.getUsername(), connection.getIpAddress());

        // Store user in connection for later use
        connection.setAttribute("user", user);
        connection.setAttribute("userId", user.getId());

        // === Send authentication sequence ===

        // 1. AuthOK - confirms authentication success
        connection.send(composerManager.compose(new AuthenticatedMessage()).getBuffer());

        // 2. Availability Status - hotel is open
        connection.send(composerManager.compose(
                new AvailabilityStatusMessage(true, false, true)
        ).getBuffer());

        // 3. Home Room - user's home room ID
        int homeRoomId = user.getHomeRoomId() != null ? user.getHomeRoomId() : 0;
        connection.send(composerManager.compose(
                new NavigatorHomeRoomMessage(homeRoomId, homeRoomId)
        ).getBuffer());

        // 4. User Permissions - rank/security level
        connection.send(composerManager.compose(
                new UserPermissionsMessage(
                        user.getRank().getClubLevel(),  // 0=none, 1=HC, 2=VIP
                        user.getRankLevel(),            // Security level
                        user.isAmbassador()             // Ambassador flag
                )
        ).getBuffer());

        // 5. Club Subscription - HC/VIP status
        connection.send(composerManager.compose(
                new UserSubscriptionMessage(
                        "habbo_club",                   // Product name
                        user.hasClub() ? 30 : 0,        // Days to period end
                        user.hasClub() ? 1 : 0,         // Member periods
                        0,                               // Periods subscribed ahead
                        1,                               // Response type
                        user.hasClub(),                  // Has ever been member
                        user.isVip(),                    // Is VIP
                        0,                               // Past club days
                        0,                               // Past VIP days
                        0,                               // Minutes until expiration
                        0                                // Minutes since last modified
                )
        ).getBuffer());

        // 6. User Info - full profile data
        connection.send(composerManager.compose(
                new UserInfoMessage(
                        user.getId().value(),
                        user.getUsername(),
                        user.getFigure(),
                        user.getGender(),
                        user.getMotto(),
                        user.getUsername(),             // Real name (same as username)
                        false,                          // Direct mail
                        user.getRespectReceived(),
                        user.getDailyRespectPoints(),
                        user.getDailyPetRespect(),
                        false,                          // Stream publishing allowed
                        "",                             // Last access date
                        false,                          // Can change name
                        false                           // Safety locked
                )
        ).getBuffer());

        // 7. Credits
        connection.send(composerManager.compose(
                new UserCreditsMessage(String.valueOf(user.getCredits()))
        ).getBuffer());

        // 8. Activity Points (pixels, diamonds)
        connection.send(composerManager.compose(
                UserCurrencyMessage.of(user.getPixels(), user.getDiamonds())
        ).getBuffer());

        // 9. Avatar Effects (empty for now - no effects owned)
        connection.send(composerManager.compose(
                AvatarEffectsMessage.empty()
        ).getBuffer());

        // 10. Navigator Settings (default window position)
        connection.send(composerManager.compose(
                new NavigatorSettingsMessage(100, 100, 435, 535, false, 0)
        ).getBuffer());

        // 11. Messenger Init (friend limits)
        connection.send(composerManager.compose(
                new MessengerInitMessage(
                        user.hasClub() ? 1100 : 300,  // User's friend limit (HC gets more)
                        300,                           // Normal friend limit
                        1100                           // Extended friend limit (HC)
                )
        ).getBuffer());

        // 12. Friend List (empty for now - no friends loaded)
        connection.send(composerManager.compose(
                FriendListFragmentMessage.empty()
        ).getBuffer());

        LOGGER.debug("Sent complete authentication sequence to {}", user.getUsername());
    }

    private void onFailure(NetworkConnection connection, AuthenticationResult.FailureReason reason) {
        LOGGER.warn("Authentication failed for {}: {}", connection.getIpAddress(), reason);

        // TODO: Send AUTH_FAILED message with error code

        connection.disconnect();
    }
}
