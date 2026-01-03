package com.nova.core.domain.api.room;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/**
 * Input Port for scheduling room-specific tasks.
 * <p>
 * This scheduler ensures thread-safe room operations by guaranteeing that
 * tasks for the same room are executed sequentially, while tasks for different
 * rooms can execute in parallel.
 * <p>
 * Uses a striped executor pattern where each room is assigned to a specific
 * thread based on its ID, preventing race conditions in room state.
 * <p>
 * <b>Usage Guidelines:</b>
 * <ul>
 *   <li>Use for room furniture operations (move, rotate, pickup, place)</li>
 *   <li>Use for room user actions (walk, sit, dance, chat)</li>
 *   <li>Use for trading operations</li>
 *   <li>Use for game operations (Wired, Battle Banzai, Freeze)</li>
 *   <li>Do NOT use for stateless operations (navigator, catalog, messenger)</li>
 * </ul>
 */
public interface RoomTaskScheduler {

    /**
     * Executes a task on the room's dedicated thread.
     * <p>
     * This method returns immediately (non-blocking). The task will be
     * executed asynchronously on the stripe assigned to this room.
     *
     * @param roomId the room ID (used to determine which stripe to use)
     * @param task   the task to execute
     */
    void execute(int roomId, Runnable task);

    /**
     * Submits a task and returns a future for its result.
     * <p>
     * Use this when you need the result of a room operation.
     *
     * @param roomId the room ID (used to determine which stripe to use)
     * @param task   the task to execute
     * @param <T>    the result type
     * @return a CompletableFuture that will contain the result
     */
    <T> CompletableFuture<T> submit(int roomId, Supplier<T> task);

    /**
     * Shuts down all executor threads gracefully.
     * <p>
     * Called during server shutdown. Waits for currently executing tasks
     * to complete but does not accept new tasks.
     */
    void shutdown();

    /**
     * Returns the number of stripes (executor threads) in use.
     *
     * @return the stripe count
     */
    int getStripeCount();
}
