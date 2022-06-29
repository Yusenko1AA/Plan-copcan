package com.java.usenko.entity;

public enum RoomStatus {
    REPAIRED("repaired"),
    SERVICED("serviced"),
    AVAILABLE("available");

    private final String value;

    private RoomStatus(String value) {
        this.value = value;
    }

    public static RoomStatus getValueOf(String value) {
        for (RoomStatus status : RoomStatus.values()) {
            if (status.value.equals(value)) {
                return status;
            }
        }
        return null;
    }

}
