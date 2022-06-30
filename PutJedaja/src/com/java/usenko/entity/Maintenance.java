package com.java.usenko.entity;

import java.util.Date;

public class Maintenance extends AbstractEntity {
    MaintenanceType maintenanceType;
    private double price;
    private Date date;

    public Maintenance(){
    }

    public Maintenance (MaintenanceType maintenanceType, int price, Date date) {
        this.maintenanceType = maintenanceType;
        this.price = price;
        this.date = date;
    }

    public MaintenanceType getMaintenanceType() {
        return maintenanceType;
    }

    public void setMaintenanceType(MaintenanceType maintenanceType) {
        this.maintenanceType = maintenanceType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

