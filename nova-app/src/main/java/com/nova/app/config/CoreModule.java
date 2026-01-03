package com.nova.app.config;

import com.google.inject.AbstractModule;
import com.nova.app.service.user.UserService;
import com.nova.core.domain.port.in.user.UserUseCase;

/**
 * Guice module for Core/Domain layer bindings.
 * <p>
 * Binds use case interfaces (input ports) to their implementations.
 */
public class CoreModule extends AbstractModule {

    @Override
    protected void configure() {
        // Bind Input Ports to Use Case implementations
        bind(UserUseCase.class).to(UserService.class);
    }
}
