package com.java.usenko.entity;

public class Maintenance {
    private Long id;
    MaintenanceType maintenanceType;
    private int price;

    public Maintenance(){

    }

    public Maintenance(Long id, MaintenanceType maintenanceType, int price) {
        this.id = id;
        this.maintenanceType = maintenanceType;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MaintenanceType getMaintenanceType() {
        return maintenanceType;
    }

    public void setMaintenanceType(MaintenanceType maintenanceType) {
        this.maintenanceType = maintenanceType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

