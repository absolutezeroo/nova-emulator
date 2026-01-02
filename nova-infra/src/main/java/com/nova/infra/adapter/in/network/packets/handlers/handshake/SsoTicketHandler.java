package com.nova.infra.adapter.in.network.packets.handlers.handshake;

import com.nova.core.application.command.AuthenticateCommand;
import com.nova.core.application.result.AuthenticationResult;
import com.nova.core.domain.model.User;
import com.nova.core.domain.port.in.UserUseCase;
import com.nova.core.domain.port.out.network.NetworkConnection;
import com.nova.infra.adapter.in.network.packets.composers.PacketComposerManager;
import com.nova.infra.adapter.in.network.packets.handlers.PacketHandler;
import com.nova.infra.adapter.in.network.packets.incoming.handshake.SSOTicketMessageEvent;
import com.nova.infra.adapter.in.network.packets.outgoing.handshake.AuthenticatedMessage;
import com.nova.infra.adapter.in.network.packets.outgoing.user.UserCreditsMessage;
import com.nova.infra.adapter.in.network.packets.outgoing.user.UserInfoMessage;
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
public class SsoTicketHandler implements PacketHandler<SSOTicketMessageEvent> {

    private static final Logger LOGGER = LoggerFactory.getLogger(SsoTicketHandler.class);

    private final UserUseCase userUseCase;
    private final PacketComposerManager composerManager;

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

        // Send AuthOK
        connection.send(composerManager.compose(new AuthenticatedMessage()).getBuffer());

        // Send user info
        UserInfoMessage userInfo = new UserInfoMessage(
                user.getId().value(),
                user.getUsername(),
                user.getFigure(),
                "M", // Gender placeholder
                user.getMotto(),
                user.getUsername(),
                false,
                0,
                0,
                0,
                false,
                "",
                false,
                false
        );
        connection.send(composerManager.compose(userInfo).getBuffer());

        // Send credits
        UserCreditsMessage credits = new UserCreditsMessage(String.valueOf(user.getCredits()));
        connection.send(composerManager.compose(credits).getBuffer());
    }

    private void onFailure(NetworkConnection connection, AuthenticationResult.FailureReason reason) {
        LOGGER.warn("Authentication failed for {}: {}", connection.getIpAddress(), reason);

        // TODO: Send AUTH_FAILED message with error code

        connection.disconnect();
    }
}
