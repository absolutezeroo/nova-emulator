package com.nova.infra.adapter.in.concurrency;

import com.nova.core.domain.port.in.room.RoomTaskScheduler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 * Striped executor implementation of {@link RoomTaskScheduler}.
 * <p>
 * Uses multiple single-threaded executors (stripes) to process room tasks.
 * Each room is assigned to a specific stripe based on its ID modulo the stripe count.
 * <p>
 * <b>Thread Safety Guarantee:</b>
 * Tasks for the same room always execute on the same stripe thread, ensuring
 * sequential execution and preventing race conditions on room state.
 * <p>
 * <b>Parallelism:</b>
 * Tasks for different rooms may execute in parallel on different stripes,
 * maximizing throughput while maintaining safety.
 * <p>
 * <pre>
 * Example with 4 stripes:
 * ┌──────────────────────────────────────┐
 * │       StripedRoomTaskScheduler       │
 * │                                      │
 * │   Stripe[0] ← roomId % 4 == 0        │
 * │   Stripe[1] ← roomId % 4 == 1        │
 * │   Stripe[2] ← roomId % 4 == 2        │
 * │   Stripe[3] ← roomId % 4 == 3        │
 * └──────────────────────────────────────┘
 * </pre>
 */
public class StripedRoomTaskScheduler implements RoomTaskScheduler {

    private static final Logger LOGGER = LoggerFactory.getLogger(StripedRoomTaskScheduler.class);
    private static final long SHUTDOWN_TIMEOUT_SECONDS = 30;

    private final ExecutorService[] stripes;
    private final int stripeCount;
    private volatile boolean isShutdown = false;

    /**
     * Creates a striped scheduler with the specified number of stripes.
     *
     * @param stripeCount the number of executor stripes (typically CPU cores)
     */
    public StripedRoomTaskScheduler(int stripeCount) {
        if (stripeCount <= 0) {
            throw new IllegalArgumentException("Stripe count must be positive");
        }

        this.stripeCount = stripeCount;
        this.stripes = new ExecutorService[stripeCount];

        for (int i = 0; i < stripeCount; i++) {
            final int stripeId = i;
            stripes[i] = Executors.newSingleThreadExecutor(runnable -> {
                Thread thread = new Thread(runnable, "RoomStripe-" + stripeId);
                thread.setDaemon(false);
                return thread;
            });
        }

        LOGGER.info("Initialized StripedRoomTaskScheduler with {} stripes", stripeCount);
    }

    /**
     * Creates a striped scheduler with stripe count equal to available CPU cores.
     */
    public StripedRoomTaskScheduler() {
        this(Runtime.getRuntime().availableProcessors());
    }

    @Override
    public void execute(int roomId, Runnable task) {
        if (isShutdown) {
            LOGGER.warn("Attempted to execute task on shutdown scheduler for room {}", roomId);
            return;
        }

        int stripe = getStripeIndex(roomId);
        stripes[stripe].execute(() -> {
            try {
                task.run();
            } catch (Exception e) {
                LOGGER.error("Error executing task for room {}: {}", roomId, e.getMessage(), e);
            }
        });
    }

    @Override
    public <T> CompletableFuture<T> submit(int roomId, Supplier<T> task) {
        if (isShutdown) {
            LOGGER.warn("Attempted to submit task on shutdown scheduler for room {}", roomId);
            return CompletableFuture.failedFuture(
                    new IllegalStateException("Scheduler is shutdown"));
        }

        int stripe = getStripeIndex(roomId);
        return CompletableFuture.supplyAsync(() -> {
            try {
                return task.get();
            } catch (Exception e) {
                LOGGER.error("Error executing task for room {}: {}", roomId, e.getMessage(), e);
                throw e;
            }
        }, stripes[stripe]);
    }

    @Override
    public void shutdown() {
        if (isShutdown) {
            return;
        }

        isShutdown = true;
        LOGGER.info("Shutting down StripedRoomTaskScheduler...");

        for (int i = 0; i < stripeCount; i++) {
            stripes[i].shutdown();
        }

        // Wait for all stripes to terminate
        for (int i = 0; i < stripeCount; i++) {
            try {
                if (!stripes[i].awaitTermination(SHUTDOWN_TIMEOUT_SECONDS, TimeUnit.SECONDS)) {
                    LOGGER.warn("Stripe {} did not terminate in time, forcing shutdown", i);
                    stripes[i].shutdownNow();
                }
            } catch (InterruptedException e) {
                LOGGER.warn("Interrupted while waiting for stripe {} to terminate", i);
                stripes[i].shutdownNow();
                Thread.currentThread().interrupt();
            }
        }

        LOGGER.info("StripedRoomTaskScheduler shutdown complete");
    }

    @Override
    public int getStripeCount() {
        return stripeCount;
    }

    /**
     * Returns the stripe index for a given room ID.
     * Uses Math.floorMod to handle negative IDs correctly.
     */
    private int getStripeIndex(int roomId) {
        return Math.floorMod(roomId, stripeCount);
    }
}
