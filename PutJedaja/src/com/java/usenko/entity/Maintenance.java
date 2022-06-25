package com.java.usenko.entity;

import java.util.Date;

public class Maintenance {
    private Long id;
    MaintenanceType maintenanceType;
    private int price;
    private Date date;

    public Maintenance(){
    }

    public Maintenance(Long id, MaintenanceType maintenanceType, int price, Date date) {
        this.id = id;
        this.maintenanceType = maintenanceType;
        this.price = price;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

