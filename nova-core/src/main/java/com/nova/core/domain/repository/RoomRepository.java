package com.nova.core.domain.repository;

import com.nova.core.domain.model.core.user.UserId;
import com.nova.core.domain.model.hotel.room.Room;
import com.nova.core.domain.model.hotel.room.RoomId;

import java.util.List;
import java.util.Optional;

/**
 * Output Port (Secondary/Driven Port) - Repository interface.
 * <p>
 * Defines persistence operations for Rooms.
 * Implemented by infrastructure adapters (MySQL repository).
 */
public interface RoomRepository {

    /**
     * Finds a room by its ID.
     *
     * @param roomId The room's ID
     * @return The room if found
     */
    Optional<Room> findById(RoomId roomId);

    /**
     * Finds all rooms owned by a user.
     *
     * @param ownerId The owner's user ID
     * @return List of rooms owned by the user
     */
    List<Room> findByOwnerId(UserId ownerId);

    /**
     * Counts rooms owned by a user.
     *
     * @param ownerId The owner's user ID
     * @return Number of rooms owned
     */
    int countByOwnerId(UserId ownerId);

    /**
     * Finds popular rooms (sorted by user count and score).
     *
     * @param limit Maximum number of rooms to return
     * @return List of popular rooms
     */
    List<Room> findPopular(int limit);

    /**
     * Searches rooms by name.
     *
     * @param query Search query (partial match)
     * @param limit Maximum number of results
     * @return List of matching rooms
     */
    List<Room> searchByName(String query, int limit);

    /**
     * Saves a room (insert or update).
     *
     * @param room The room to save
     * @return The saved room
     */
    Room save(Room room);

    /**
     * Deletes a room.
     *
     * @param roomId The room ID to delete
     * @return true if deleted, false if not found
     */
    boolean delete(RoomId roomId);

    /**
     * Updates the user count for a room.
     *
     * @param roomId The room ID
     * @param count The new user count
     */
    void updateUserCount(RoomId roomId, int count);

    /**
     * Increments the room score (when user likes it).
     *
     * @param roomId The room ID
     */
    void incrementScore(RoomId roomId);
}
