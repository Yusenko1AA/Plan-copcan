package com.java.usenko.entity;

public enum MaintenanceType {
    MASSAGE("massage"),
    CLEANING("cleaning"),
    ALCOHOL("alcohol"),
    FOOD("food");

    private final String value;

    MaintenanceType(String value) {
        this.value = value;
    }

    public static MaintenanceType getValueOf(String value) {
        for (MaintenanceType status : MaintenanceType.values()) {
            if (status.value.equals(value)) {
                return status;
            }
        }
        return null;
    }
}
