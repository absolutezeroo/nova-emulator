package com.nova.core.domain.model.hotel.unit;

import com.nova.core.domain.model.hotel.room.RoomId;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Domain entity representing an entity in a room.
 * <p>
 * RoomUnit is the base for all entities that can exist in a room:
 * - Players (USER type)
 * - Bots (BOT type)
 * - Pets (PET type)
 */
public class RoomUnit {
    private static final AtomicInteger ID_GENERATOR = new AtomicInteger(0);

    // Identity
    private final int virtualId;
    private final RoomUnitType type;
    private final RoomId roomId;

    // Position & Movement
    private Position position;
    private Position targetPosition;
    private boolean walking;
    private boolean canWalk;

    // Status map (key -> value)
    private final Map<String, String> statuses;

    // State
    private int effect;
    private int handItem;
    private int danceType;
    private boolean invisible;
    private boolean idle;
    private int idleTimer;

    public RoomUnit(RoomUnitType type, RoomId roomId, Position position) {
        this.virtualId = ID_GENERATOR.incrementAndGet();
        this.type = Objects.requireNonNull(type, "Unit type cannot be null");
        this.roomId = Objects.requireNonNull(roomId, "Room ID cannot be null");
        this.position = position != null ? position : Position.zero();
        this.targetPosition = null;
        this.walking = false;
        this.canWalk = true;
        this.statuses = new HashMap<>();
        this.effect = 0;
        this.handItem = 0;
        this.danceType = 0;
        this.invisible = false;
        this.idle = false;
        this.idleTimer = 0;
    }

    public static RoomUnit createUser(RoomId roomId, Position position) {
        return new RoomUnit(RoomUnitType.USER, roomId, position);
    }

    public static RoomUnit createBot(RoomId roomId, Position position) {
        return new RoomUnit(RoomUnitType.BOT, roomId, position);
    }

    public static RoomUnit createPet(RoomId roomId, Position position) {
        return new RoomUnit(RoomUnitType.PET, roomId, position);
    }

    // ============== Movement ==============

    public void setPosition(Position newPosition) {
        this.position = newPosition;
    }

    public void moveTo(int x, int y, double z) {
        this.position = position.moveTo(x, y, z);
    }

    public void setTargetPosition(Position target) {
        this.targetPosition = target;
        this.walking = target != null;
    }

    public void stopWalking() {
        this.targetPosition = null;
        this.walking = false;
        removeStatus(RoomUnitStatus.MOVE);
    }

    public void setRotation(int rotation) {
        this.position = position.withRotation(rotation);
    }

    public void lookAt(Position target) {
        int rotation = position.calculateRotation(target);
        this.position = position.withHeadRotation(rotation);
    }

    public void facePosition(Position target) {
        int rotation = position.calculateRotation(target);
        this.position = position.withRotation(rotation);
    }

    // ============== Status Management ==============

    public void setStatus(String key, String value) {
        statuses.put(key, value);
    }

    public void removeStatus(String key) {
        statuses.remove(key);
    }

    public String getStatus(String key) {
        return statuses.get(key);
    }

    public boolean hasStatus(String key) {
        return statuses.containsKey(key);
    }

    public void clearStatuses() {
        statuses.clear();
    }

    public Map<String, String> getStatuses() {
        return Collections.unmodifiableMap(statuses);
    }

    // ============== Sitting & Laying ==============

    public void sit(double height) {
        setStatus(RoomUnitStatus.SIT, String.valueOf(height));
        stopWalking();
    }

    public void lay(double height) {
        setStatus(RoomUnitStatus.LAY, String.valueOf(height));
        stopWalking();
    }

    public void standUp() {
        removeStatus(RoomUnitStatus.SIT);
        removeStatus(RoomUnitStatus.LAY);
    }

    public boolean isSitting() {
        return hasStatus(RoomUnitStatus.SIT);
    }

    public boolean isLaying() {
        return hasStatus(RoomUnitStatus.LAY);
    }

    // ============== Actions ==============

    public void setEffect(int effectId) {
        this.effect = effectId;
    }

    public void setHandItem(int itemId) {
        this.handItem = itemId;
    }

    public void setDance(int danceId) {
        this.danceType = danceId;
        if (danceId > 0) {
            standUp();
        }
    }

    public void wave() {
        setStatus(RoomUnitStatus.WAVE, "");
    }

    public void sign(int signId) {
        if (signId >= 0 && signId <= 17) {
            setStatus(RoomUnitStatus.SIGN, String.valueOf(signId));
        }
    }

    public void setGesture(String gesture) {
        setStatus(RoomUnitStatus.GESTURE, gesture);
    }

    // ============== Idle Management ==============

    public void incrementIdleTimer() {
        this.idleTimer++;
        if (idleTimer >= 600) { // 10 minutes at 1 tick/second
            this.idle = true;
        }
    }

    public void resetIdleTimer() {
        this.idleTimer = 0;
        this.idle = false;
    }

    // ============== Getters ==============

    public int getVirtualId() { return virtualId; }
    public RoomUnitType getType() { return type; }
    public RoomId getRoomId() { return roomId; }
    public Position getPosition() { return position; }
    public Position getTargetPosition() { return targetPosition; }
    public boolean isWalking() { return walking; }
    public boolean canWalk() { return canWalk; }
    public void setCanWalk(boolean canWalk) { this.canWalk = canWalk; }
    public int getEffect() { return effect; }
    public int getHandItem() { return handItem; }
    public int getDanceType() { return danceType; }
    public boolean isInvisible() { return invisible; }
    public void setInvisible(boolean invisible) { this.invisible = invisible; }
    public boolean isIdle() { return idle; }
    public int getIdleTimer() { return idleTimer; }

    // Position convenience getters
    public int getX() { return position.x(); }
    public int getY() { return position.y(); }
    public double getZ() { return position.z(); }
    public int getHeadRotation() { return position.headRotation(); }
    public int getBodyRotation() { return position.bodyRotation(); }

    @Override
    public String toString() {
        return "RoomUnit{id=" + virtualId + ", type=" + type + ", pos=" + position + "}";
    }
}
