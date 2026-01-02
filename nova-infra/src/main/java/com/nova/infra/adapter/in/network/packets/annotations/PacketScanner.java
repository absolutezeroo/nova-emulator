package com.nova.infra.adapter.in.network.packets.annotations;

import com.google.inject.Injector;
import com.nova.infra.adapter.in.network.packets.IIncomingPacket;
import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.composers.PacketComposerManager;
import com.nova.infra.adapter.in.network.packets.handlers.PacketHandler;
import com.nova.infra.adapter.in.network.packets.handlers.PacketHandlerManager;
import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.parsers.PacketParserManager;
import io.github.classgraph.ClassGraph;
import io.github.classgraph.ClassInfo;
import io.github.classgraph.ScanResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Scans the classpath for packet-related annotations and registers them automatically.
 * <p>
 * This replaces the manual PacketRegistry by using reflection to discover:
 * <ul>
 *   <li>{@link ParsesPacket} - Parsers that convert bytes to typed events</li>
 *   <li>{@link ComposesPacket} - Composers that serialize messages to bytes</li>
 *   <li>{@link HandlesPacket} - Handlers that process events (instantiated via Guice)</li>
 * </ul>
 * <p>
 * Benefits:
 * <ul>
 *   <li>No need to maintain a massive registry file</li>
 *   <li>Adding new packets only requires the annotation</li>
 *   <li>Type-safe and compile-time checked</li>
 * </ul>
 */
public class PacketScanner {

    private static final Logger LOGGER = LoggerFactory.getLogger(PacketScanner.class);

    private static final String BASE_PACKAGE = "com.nova.infra.adapter.in.network.packets";

    /**
     * Scans and registers all parsers annotated with {@link ParsesPacket}.
     *
     * @param manager the parser manager to register to
     * @return the number of parsers registered
     */
    public static int registerParsers(PacketParserManager manager) {
        int count = 0;

        try (ScanResult scanResult = new ClassGraph()
                .enableAnnotationInfo()
                .enableClassInfo()
                .acceptPackages(BASE_PACKAGE + ".parsers")
                .scan()) {

            for (ClassInfo classInfo : scanResult.getClassesWithAnnotation(ParsesPacket.class)) {
                try {
                    @SuppressWarnings("unchecked")
                    Class<? extends PacketParser<?>> parserClass =
                            (Class<? extends PacketParser<?>>) classInfo.loadClass();

                    // Parser reads header ID from annotation in constructor
                    PacketParser<?> parser = parserClass.getDeclaredConstructor().newInstance();
                    manager.register(parser);

                    count++;
                    LOGGER.trace("Registered parser: {} for header {}",
                            parserClass.getSimpleName(), parser.getHeaderId());

                } catch (Exception e) {
                    LOGGER.error("Failed to register parser: {}", classInfo.getName(), e);
                }
            }
        }

        LOGGER.info("Registered {} packet parsers", count);
        return count;
    }

    /**
     * Scans and registers all composers annotated with {@link ComposesPacket}.
     *
     * @param manager the composer manager to register to
     * @return the number of composers registered
     */
    public static int registerComposers(PacketComposerManager manager) {
        int count = 0;

        try (ScanResult scanResult = new ClassGraph()
                .enableAnnotationInfo()
                .enableClassInfo()
                .acceptPackages(BASE_PACKAGE + ".composers")
                .scan()) {

            for (ClassInfo classInfo : scanResult.getClassesWithAnnotation(ComposesPacket.class)) {
                try {
                    @SuppressWarnings("unchecked")
                    Class<? extends PacketComposer<?>> composerClass =
                            (Class<? extends PacketComposer<?>>) classInfo.loadClass();

                    PacketComposer<?> composer = composerClass.getDeclaredConstructor().newInstance();
                    manager.register(composer);

                    count++;
                    LOGGER.trace("Registered composer: {}", composerClass.getSimpleName());

                } catch (Exception e) {
                    LOGGER.error("Failed to register composer: {}", classInfo.getName(), e);
                }
            }
        }

        LOGGER.info("Registered {} packet composers", count);
        return count;
    }

    /**
     * Scans and registers all handlers annotated with {@link HandlesPacket}.
     * <p>
     * Handlers are instantiated via Guice to support dependency injection.
     *
     * @param manager  the handler manager to register to
     * @param injector the Guice injector for instantiating handlers
     * @return the number of handlers registered
     */
    @SuppressWarnings("unchecked")
    public static int registerHandlers(PacketHandlerManager manager, Injector injector) {
        int count = 0;

        try (ScanResult scanResult = new ClassGraph()
                .enableAnnotationInfo()
                .enableClassInfo()
                .acceptPackages(BASE_PACKAGE + ".handlers")
                .scan()) {

            for (ClassInfo classInfo : scanResult.getClassesWithAnnotation(HandlesPacket.class)) {
                try {
                    Class<? extends PacketHandler<?>> handlerClass =
                            (Class<? extends PacketHandler<?>>) classInfo.loadClass();

                    HandlesPacket annotation = handlerClass.getAnnotation(HandlesPacket.class);
                    Class<? extends IIncomingPacket> eventClass = annotation.value();

                    // Instantiate via Guice for dependency injection
                    PacketHandler<?> handler = injector.getInstance(handlerClass);

                    // Register with raw types (manager handles the type casting internally)
                    manager.register((Class) eventClass, (PacketHandler) handler);

                    count++;
                    LOGGER.debug("Registered handler: {} for event {}",
                            handlerClass.getSimpleName(), eventClass.getSimpleName());

                } catch (Exception e) {
                    LOGGER.error("Failed to register handler: {}", classInfo.getName(), e);
                }
            }
        }

        LOGGER.info("Registered {} packet handlers", count);
        return count;
    }

    /**
     * Registers all packet components (parsers, composers, handlers).
     *
     * @param parserManager   the parser manager
     * @param composerManager the composer manager
     * @param handlerManager  the handler manager
     * @param injector        the Guice injector
     */
    public static void registerAll(
            PacketParserManager parserManager,
            PacketComposerManager composerManager,
            PacketHandlerManager handlerManager,
            Injector injector) {

        LOGGER.info("Starting packet component scan...");
        long start = System.currentTimeMillis();

        int parsers = registerParsers(parserManager);
        int composers = registerComposers(composerManager);
        int handlers = registerHandlers(handlerManager, injector);

        long elapsed = System.currentTimeMillis() - start;
        LOGGER.info("Packet scan complete: {} parsers, {} composers, {} handlers in {}ms",
                parsers, composers, handlers, elapsed);
    }
}
