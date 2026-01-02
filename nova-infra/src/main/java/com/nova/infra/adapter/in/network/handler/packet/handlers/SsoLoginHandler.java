package com.nova.infra.adapter.in.network.handler.packet.handlers;

import com.nova.core.application.command.AuthenticateCommand;
import com.nova.core.application.result.AuthenticationResult;
import com.nova.core.domain.model.User;
import com.nova.core.domain.port.in.UserUseCase;
import com.nova.core.domain.port.out.network.NetworkConnection;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.codec.ServerMessage;
import com.nova.infra.adapter.in.network.handler.packet.Outgoing;
import com.nova.infra.adapter.in.network.handler.packet.PacketHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Handles SSO ticket authentication (Incoming packet ID: 2419).
 * <p>
 * This handler bridges the network layer to the domain layer by:
 * 1. Reading the SSO ticket from the binary packet
 * 2. Creating an AuthenticateCommand (domain DTO)
 * 3. Invoking the UserUseCase
 * 4. Sending appropriate response to the client
 * <p>
 * Following Hexagonal Architecture, this handler is the only place
 * that knows about both ClientMessage (infra) and AuthenticateCommand (domain).
 */
public class SsoLoginHandler implements PacketHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(SsoLoginHandler.class);

    private final UserUseCase userUseCase;

    public SsoLoginHandler(UserUseCase userUseCase) {
        this.userUseCase = userUseCase;
    }

    @Override
    public void handle(NetworkConnection connection, ClientMessage message) {
        // Read SSO ticket from binary packet
        String ssoTicket = message.readString();

        LOGGER.debug("SSO login attempt from {} with ticket length {}",
                connection.getIpAddress(), ssoTicket.length());

        // Create domain command (abstracts away the binary format)
        AuthenticateCommand command = new AuthenticateCommand(ssoTicket);

        // Invoke the use case
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

        // Store user in connection attributes for later use
        connection.setAttribute("user", user);
        connection.setAttribute("userId", user.getId());

        // Send AuthOK to client
        ServerMessage authOk = new ServerMessage(Outgoing.AUTH_OK);
        connection.send(authOk);

        // Send user data
        sendUserData(connection, user);
    }

    private void onFailure(NetworkConnection connection, AuthenticationResult.FailureReason reason) {
        LOGGER.warn("Authentication failed for {}: {}", connection.getIpAddress(), reason);

        // Send authentication failed message
        ServerMessage authFailed = new ServerMessage(Outgoing.AUTH_FAILED);
        authFailed.appendInt(getErrorCode(reason));
        connection.send(authFailed);

        // Disconnect after failed auth
        connection.disconnect();
    }

    private void sendUserData(NetworkConnection connection, User user) {
        // USER_OBJECT packet
        ServerMessage userObject = new ServerMessage(Outgoing.USER_OBJECT);
        userObject.appendInt(user.getId().value());
        userObject.appendString(user.getUsername());
        userObject.appendString(user.getFigure());
        userObject.appendString("M"); // Gender placeholder
        userObject.appendString(user.getMotto());
        userObject.appendString(user.getUsername()); // Real name
        userObject.appendBoolean(false); // Direct mail
        userObject.appendInt(0); // Respect points
        userObject.appendInt(0); // Daily respect points
        userObject.appendInt(0); // Daily pet respect points
        userObject.appendBoolean(false); // Friend stream active
        userObject.appendString(""); // Last access date
        userObject.appendBoolean(false); // Name change allowed
        userObject.appendBoolean(false); // Safety locked
        connection.send(userObject);

        // USER_CREDITS packet
        ServerMessage credits = new ServerMessage(Outgoing.USER_CREDITS);
        credits.appendString(String.valueOf(user.getCredits()));
        connection.send(credits);
    }

    private int getErrorCode(AuthenticationResult.FailureReason reason) {
        return switch (reason) {
            case INVALID_TICKET -> 1;
            case TICKET_EXPIRED -> 2;
            case USER_BANNED -> 3;
            case USER_NOT_FOUND -> 4;
        };
    }
}
